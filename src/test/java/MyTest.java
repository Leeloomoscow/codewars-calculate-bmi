import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }

    private static class Calculate {
        public static String bmi(double weight, double height) {
            String category = "";
            double BMI = weight / (height * height);
            if (BMI <= 18.5) {
                return "Underweight";
            }
            if (BMI <= 25.0) {
                return "Normal";
            }
            if (BMI <= 30.0) {
                return "Overweight";
            }
            if (BMI > 30) {
                return "Obese";
            }
            return category;
        }
    }
}

