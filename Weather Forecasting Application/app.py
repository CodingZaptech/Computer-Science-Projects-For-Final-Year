from services import WeatherService
from flask import Flask, request, render_template

app = Flask(__name__)
weather_service = WeatherService()

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/forecast', methods=['POST'])
def forecast():
    city = request.form['city']
    result = weather_service.get_forecast(city)
    return render_template('index.html', result=result)

if __name__ == "__main__":
    app.run(debug=True)
