from services import SpamDetectorService

# Main entry point for SMS Spam Detection
def main():
    service = SpamDetectorService("sms_data.csv")  # Replace with your CSV file path

    # Train the model
    service.train_model()

    # Test prediction
    test_sms = ["Congratulations! You won a free ticket!", "Hello, let's meet tomorrow."]
    predictions = service.predict(test_sms)

    for sms, pred in zip(test_sms, predictions):
        print(f"SMS: '{sms}' → Prediction: {pred}")

if __name__ == "__main__":
    main()
