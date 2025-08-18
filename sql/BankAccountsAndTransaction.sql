# SQL Challenge – Bank Transactions & Balances
You are given the following tables:

accounts
account_id	customer_id	account_type	created_at
101	1	savings	2021-01-15
102	1	checking	2021-02-20
103	2	savings	2021-03-10
104	3	checking	2021-04-05

transactions
transaction_id	account_id	amount	transaction_type	transaction_date
1	101	500.00	deposit	2021-02-01
2	101	-200.00	withdrawal	2021-02-05
3	102	1000.00	deposit	2021-03-01
4	103	700.00	deposit	2021-03-15
5	104	400.00	deposit	2021-04-10
6	104	-50.00	withdrawal	2021-04-15
7	103	-100.00	withdrawal	2021-04-20
8	102	-300.00	withdrawal	2021-05-01

Question:
Write an SQL query to produce the following result:
For each customer, list:
- customer_id
- Total number of accounts they own
- The account_id of their highest balance account (after applying all transactions)
- That account’s balance
- The date of their most recent transaction across all accounts
- If two accounts have the same balance, pick the one with the smallest account_id.



#Solution:
-- 1. Compute balance and last transaction per account
WITH account_balances AS (
    SELECT 
        a.customer_id,
        a.account_id,
        COALESCE(SUM(t.amount), 0) AS balance,
        MAX(t.transaction_date) AS last_transaction_date
    FROM accounts a
    LEFT JOIN transactions t 
        ON a.account_id = t.account_id
    GROUP BY a.customer_id, a.account_id
),
-- 2. Pick the highest balance account per customer
max_balance_accounts AS (
    SELECT 
        ab.customer_id,
        ab.account_id,
        ab.balance
    FROM account_balances ab
    WHERE ab.account_id = (
        SELECT ab2.account_id
        FROM account_balances ab2
        WHERE ab2.customer_id = ab.customer_id
        ORDER BY ab2.balance DESC, ab2.account_id ASC
        LIMIT 1
    )
)
-- 3. Final result
SELECT 
    ab.customer_id,
    COUNT(DISTINCT ab.account_id) AS total_accounts,
    mba.account_id AS highest_balance_account,
    mba.balance,
    MAX(ab.last_transaction_date) AS most_recent_transaction
FROM account_balances ab
JOIN max_balance_accounts mba 
    ON ab.customer_id = mba.customer_id
GROUP BY ab.customer_id, mba.account_id, mba.balance
ORDER BY ab.customer_id;
