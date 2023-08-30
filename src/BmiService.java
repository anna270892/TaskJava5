public class BmiService {
    public float calculate(float weight, float height) {   // два значения на вход вес и рост
        float bmi;
        bmi = weight / (height * height);

        return (int) bmi;
    }
}
