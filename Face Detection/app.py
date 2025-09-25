from services import FaceDetectionService

# Main entry point for Face Detection
def main():
    service = FaceDetectionService()

    # Detect faces in a sample image
    image_path = "sample_face.jpg"  # Replace with your image path
    faces = service.detect_faces(image_path)

    print(f"Number of faces detected: {len(faces)}")

if __name__ == "__main__":
    main()
