# Service to provide weather forecasts (mock data for simplicity)
class WeatherService:
    def get_forecast(self, city):
        # In real scenario, fetch data from API
        return f"Weather forecast for {city}: Sunny, 25°C"
