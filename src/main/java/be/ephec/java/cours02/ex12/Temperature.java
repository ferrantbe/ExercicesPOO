package be.ephec.java.cours02.ex12;

public class Temperature {
    private double valeur;
    private TemperatureUnit unit;

    public Temperature(double valeur, TemperatureUnit unit) {
        this.valeur = valeur;
        this.unit = unit;
    }

    public double getValue(TemperatureUnit unit) {
        if (unit == this.unit)
            return valeur;
        else if (this.unit == TemperatureUnit.FAHRENHEIT)
            return farenheitToCelsius();
        else
            return celsiusToFarenheit();
    }

    private double celsiusToFarenheit() {
        return valeur * 9. / 5 + 32;
    }

    private double farenheitToCelsius() {
        return (valeur - 32.) * 5 / 9;
    }

    public void setValue(double value, TemperatureUnit unit) {
        this.valeur = value;
        this.unit = unit;
    }
}
