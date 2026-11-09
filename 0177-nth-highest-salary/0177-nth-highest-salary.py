import pandas as pd


def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
  sorted_salaries = employee['salary'].drop_duplicates().sort_values(
      ascending=False
  )

  col_name = f'getNthHighestSalary({N})'

  if N > len(sorted_salaries) or N <= 0:
    return pd.DataFrame({col_name: [None]})

  nth_highest = sorted_salaries.iloc[N - 1]

  return pd.DataFrame({col_name: [nth_highest]})
