// Task 2: Write a Java program that:
//           • Stores an integer value for temperature in Celsius.
//           • Converts it to Fahrenheit using the formula F = (C × 9/5) + 32.
//           • Displays both Celsius and Fahrenheit values.

public class code_2 {
    public static void main (String[] args) {
        int celsius = 37;
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Celsius : " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit : " + fahrenheit + "°F");

    }

}
