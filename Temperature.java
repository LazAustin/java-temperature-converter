
public class Temperature {
    private double degreesFahrenheit; // Fahrenheit temperature
    private double degreesCelsius; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature


    public Temperature() {
        this(0.0);
    }

    public Temperature(double degrees) {
        setDegreesFahrenheit(degrees);
    }

    public void setDegreesFahrenheit(double degrees) {
        degreesFahrenheit = degrees; // set Fahrenheit value
        degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
        degreesKelvin = degreesCelsius + 273.15; // set Kelvin value
    }

    public double getDegreesCelsius() {
        return degreesCelsius;
    }
    
    public double getDegreesKelvin() {
        return degreesKelvin;
    }
}