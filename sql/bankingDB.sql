Table: customers
| customer\_id | name    | city     |
| ------------ | ------- | -------- |
| 1            | Alice   | New York |
| 2            | Bob     | Chicago  |
| 3            | Charlie | Boston   |

Table: accounts
| account\_id | customer\_id | account\_type | balance |
| ----------- | ------------ | ------------- | ------- |
| 101         | 1            | savings       | 5000    |
| 102         | 1            | checking      | 2000    |
| 103         | 2            | savings       | 8000    |
| 104         | 3            | checking      | 3000    |

Table: transactions
| transaction\_id | account\_id | amount | transaction\_type | transaction\_date |
| --------------- | ----------- | ------ | ----------------- | ----------------- |
| 201             | 101         | 500    | deposit           | 2021-01-10        |
| 202             | 102         | 1000   | withdrawal        | 2021-01-12        |
| 203             | 103         | 2000   | deposit           | 2021-02-05        |
| 204             | 104         | 500    | withdrawal        | 2021-02-07        |


1. List all customers who live in New York.
SELECT name
FROM customers
WHERE city = 'New York';
✅ Output: Alice

2. Find total balance of each customer (combine all accounts).
SELECT c.name, SUM(a.balance) AS total_balance
FROM customers c
JOIN accounts a ON c.customer_id = a.customer_id
GROUP BY c.name;
✅ Output:
Alice → 7000
Bob → 8000
Charlie → 3000


3. Show all transactions greater than $1000.
SELECT *
FROM transactions
WHERE amount > 1000;
✅ Output: Transaction 203 (2000 deposit)


4. Find the customer who has the highest balance.
SELECT c.name, a.balance
FROM customers c
JOIN accounts a ON c.customer_id = a.customer_id
ORDER BY a.balance DESC
LIMIT 1;
✅ Output: Bob (8000)


5. Count number of transactions per account.
SELECT account_id, COUNT(*) AS total_transactions
FROM transactions
GROUP BY account_id;
✅ Output:
101 → 1
102 → 1
103 → 1
104 → 1


6. Find customers who have both savings and checking accounts.
SELECT c.name
FROM customers c
JOIN accounts a1 ON c.customer_id = a1.customer_id AND a1.account_type = 'savings'
JOIN accounts a2 ON c.customer_id = a2.customer_id AND a2.account_type = 'checking';
✅ Output: Alice


7. Find the average transaction amount per transaction type.
SELECT transaction_type, AVG(amount) AS avg_amount
FROM transactions
GROUP BY transaction_type;
✅ Output:
deposit → 1250
withdrawal → 750