import pandas as pd

class TaxiDataService:
    """
    Service to handle taxi data analysis using Pandas.
    """

    def __init__(self, file_path):
        """
        Initialize the service with a CSV file path.
        """
        self.data = pd.read_csv(file_path)

    def dataset_info(self):
        """
        Display basic information about the dataset.
        """
        print(self.data.info())
        print(self.data.head())

    def average_trip_distance(self):
        """
        Calculate the average trip distance.
        """
        if 'trip_distance' in self.data.columns:
            return self.data['trip_distance'].mean()
        return "Column 'trip_distance' not found."

    def trips_per_day(self):
        """
        Count the number of trips per day.
        """
        if 'pickup_datetime' in self.data.columns:
            self.data['pickup_datetime'] = pd.to_datetime(self.data['pickup_datetime'])
            return self.data.groupby(self.data['pickup_datetime'].dt.date).size()
        return "Column 'pickup_datetime' not found."
