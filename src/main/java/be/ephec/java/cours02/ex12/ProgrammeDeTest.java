package be.ephec.java.cours02.ex12;

public class ProgrammeDeTest {
    public static void main(String[] args) {
        Temperature celcius10 = new Temperature(10, TemperatureUnit.CELSIUS);
        System.out.printf("10°C en °C: %.2f\n", celcius10.getValue(TemperatureUnit.CELSIUS));
        System.out.printf("10°C en °F: %.2f\n", celcius10.getValue(TemperatureUnit.FAHRENHEIT));
        System.out.println();

        Temperature farenheit23 = new Temperature(23, TemperatureUnit.FAHRENHEIT);
        System.out.printf("23°F en °F: %.2f\n", farenheit23.getValue(TemperatureUnit.FAHRENHEIT));
        System.out.printf("23°F en °C: %.2f\n", farenheit23.getValue(TemperatureUnit.CELSIUS));
    }
}
