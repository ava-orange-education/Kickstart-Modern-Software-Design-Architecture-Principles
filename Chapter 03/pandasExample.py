import pandas as pd

# Creating a DataFrame
myData = {'Name': ['Neo', 'Muzz', 'Trinity'],
        'Age': [25, 15, 27],
        'City': ['Zion', 'Tullahoma', 'San Diego']}

myDataFrame = pd.DataFrame(myData)

# Displaying the DataFrame
print(myDataFrame)
