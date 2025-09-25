import random

class NewsService:
    """
    Service to fetch and manage news articles.
    """

    def __init__(self):
        # Mock news data
        self.news = [
            {"title": "Global markets rally on economic data", "category": "Business"},
            {"title": "New AI trends in 2025", "category": "Technology"},
            {"title": "Sports championships results announced", "category": "Sports"},
            {"title": "Climate change and its effects", "category": "Environment"},
            {"title": "New movie releases this week", "category": "Entertainment"},
            {"title": "Political debate heats up", "category": "Politics"},
        ]
        self.categories = list(set(article["category"] for article in self.news))

    def get_latest_news(self, category=None, search=None):
        """
        Return latest news filtered by category or search keyword.
        """
        filtered_news = self.news

        if category:
            filtered_news = [n for n in filtered_news if n["category"].lower() == category.lower()]

        if search:
            filtered_news = [n for n in filtered_news if search.lower() in n["title"].lower()]

        # Shuffle to simulate dynamic latest news
        random.shuffle(filtered_news)
        return filtered_news

    def get_categories(self):
        """
        Return list of available news categories.
        """
        return self.categories
