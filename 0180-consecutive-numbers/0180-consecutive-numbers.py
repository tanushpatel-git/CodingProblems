import pandas as pd

def consecutive_numbers(logs: pd.DataFrame) -> pd.DataFrame:
    is_consecutive = (
        (logs['num'] == logs['num'].shift(-1)) & 
        (logs['num'] == logs['num'].shift(-2))
    )
    result = logs[is_consecutive]['num'].drop_duplicates().to_frame()
    result.columns = ['ConsecutiveNums']
    
    return result
