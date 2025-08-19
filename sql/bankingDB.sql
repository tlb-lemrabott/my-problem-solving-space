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


