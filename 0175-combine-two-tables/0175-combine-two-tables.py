import pandas as pd

def combine_two_tables(person: pd.DataFrame, address: pd.DataFrame) -> pd.DataFrame:
    merged_df = pd.merge(person, address, on='personId', how='left')
    
    return merged_df[['firstName', 'lastName', 'city', 'state']]
