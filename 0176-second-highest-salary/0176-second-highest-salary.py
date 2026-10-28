import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:

    df = employee['salary'].sort_values(ascending=False)
    
    if df.empty:
        return pd.DataFrame({'SecondHighestSalary': [None]})
        
    highest = df.iloc[0]
    second_highest = None
    
    for i in range(df.shape[0]):
        if df.iloc[i] < highest:
            second_highest = df.iloc[i]
            break
            
    return pd.DataFrame({'SecondHighestSalary': [second_highest]})
