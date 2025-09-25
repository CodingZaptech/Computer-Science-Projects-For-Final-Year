from textblob import TextBlob

class SentimentService:
    """
    Service to analyze sentiment of tweets.
    """

    def analyze_sentiment(self, tweets):
        """
        Analyze sentiment for a list of tweets.
        Returns 'Positive', 'Negative', or 'Neutral'.
        """
        results = []
        for tweet in tweets:
            analysis = TextBlob(tweet)
            if analysis.sentiment.polarity > 0:
                results.append("Positive")
            elif analysis.sentiment.polarity < 0:
                results.append("Negative")
            else:
                results.append("Neutral")
        return results
