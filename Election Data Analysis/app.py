from services import ElectionDataService

# Main entry point for Election Data Analysis
def main():
    service = ElectionDataService("election_data.csv")  # Replace with your CSV file path

    # Display dataset info
    service.dataset_info()

    # Show total votes per candidate
    print("\nTotal Votes per Candidate:")
    print(service.total_votes_per_candidate())

    # Plot votes distribution
    service.plot_votes_distribution()

if __name__ == "__main__":
    main()
