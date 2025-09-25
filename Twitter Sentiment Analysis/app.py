from services import SentimentService

# Main entry point for Twitter Sentiment Analysis
def main():
    service = SentimentService()

    # Analyze sample tweets (replace with real Twitter API data)
    tweets = ["I love this platform!", "I hate the new update."]
    results = service.analyze_sentiment(tweets)

    for tweet, sentiment in zip(tweets, results):
        print(f"Tweet: '{tweet}' → Sentiment: {sentiment}")

if __name__ == "__main__":
    main()
