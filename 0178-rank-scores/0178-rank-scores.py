import pandas as pd

def order_scores(scores: pd.DataFrame) -> pd.DataFrame:
    ordered_df = scores.sort_values(by='score', ascending=False)
    
    ordered_df['rank'] = ordered_df['score'].rank(method='dense', ascending=False).astype(int)
    
    
    return ordered_df[['score', 'rank']]
