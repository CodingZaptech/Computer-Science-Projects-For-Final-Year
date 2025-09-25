import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.naive_bayes import MultinomialNB
from sklearn.pipeline import Pipeline

class SpamDetectorService:
    """
    Service to handle SMS Spam Detection using Machine Learning.
    """

    def __init__(self, file_path):
        self.data = pd.read_csv(file_path)
        self.model = None

    def train_model(self):
        """
        Train a simple Naive Bayes model for spam detection.
        """
        X = self.data['message']
        y = self.data['label']  # 'spam' or 'ham'
        X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

        # Pipeline: Convert text to vectors -> Train Multinomial Naive Bayes
        self.model = Pipeline([
            ('vectorizer', CountVectorizer()),
            ('classifier', MultinomialNB())
        ])

        self.model.fit(X_train, y_train)
        print("Model trained successfully.")

    def predict(self, messages):
        """
        Predict spam or ham for a list of messages.
        """
        if self.model is None:
            raise Exception("Model not trained yet.")
        return self.model.predict(messages)
