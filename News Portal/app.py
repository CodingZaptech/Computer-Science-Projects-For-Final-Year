from services import NewsService

# Main entry point for Latest News Portal
def main():
    service = NewsService()

    # Fetch latest news (mock data)
    news_list = service.get_latest_news()
    print("Latest News Headlines:")
    for news in news_list:
        print("- " + news)

if __name__ == "__main__":
    main()
