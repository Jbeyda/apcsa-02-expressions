/**
 * Exercise 7 — TemperatureConverter
 *
 * Convert both directions, to one decimal place.
 *
 *   C = (F - 32) * 5 / 9
 *   F = C * 9 / 5 + 32
 *
 * ⚠️ Careful: 5 / 9 in integer arithmetic is 0.
 *    Everything after that will be zero. Fix it.
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37.0;

        // Fahrenheit to Celsius
        double convertedCelsius = (fahrenheit - 32) * 5.0 / 9;
        
        // Celsius to Fahrenheit
        double convertedFahrenheit = celsius * 9.0 / 5 + 32;

        System.out.printf("Fahrenheit to Celsius: %.1f°C%n", convertedCelsius);
        System.out.printf("Celsius to Fahrenheit: %.1f°F%n", convertedFahrenheit);
    }
}
