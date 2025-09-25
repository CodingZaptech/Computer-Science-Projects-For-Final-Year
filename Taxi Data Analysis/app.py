from services import TaxiDataService

# Main entry point for Taxi Data Analysis
def main():
    # Initialize the service
    service = TaxiDataService("taxi_data.csv")  # Replace with your CSV file path

    # Display basic info about the dataset
    print("Dataset Info:")
    service.dataset_info()

    # Show average trip distance
    print("\nAverage Trip Distance:", service.average_trip_distance())

    # Show number of trips per day
    print("\nTrips per Day:")
    print(service.trips_per_day())

if __name__ == "__main__":
    main()
