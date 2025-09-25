import pandas as pd
import matplotlib.pyplot as plt

class ElectionDataService:
    """
    Service to analyze election data.
    """

    def __init__(self, file_path):
        self.data = pd.read_csv(file_path)

    def dataset_info(self):
        """Display basic dataset info."""
        print(self.data.info())
        print(self.data.head())

    def total_votes_per_candidate(self):
        """Count total votes per candidate."""
        if 'candidate' in self.data.columns:
            return self.data['candidate'].value_counts()
        return "Column 'candidate' not found."

    def plot_votes_distribution(self):
        """Plot votes distribution."""
        if 'candidate' in self.data.columns:
            counts = self.data['candidate'].value_counts()
            counts.plot(kind='bar', title='Votes per Candidate')
            plt.show()
        else:
            print("Column 'candidate' not found.")
