import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        FToKConverter fToKConverter = new FToKConverter();
        FToCAdapter adapter = new FToCAdapter(fToKConverter);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = adapter.convert(fahrenheit);

        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
    }
}
