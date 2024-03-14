package funciones;

public class Temperatura {
    public double celsius_fahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public double fahrenheit_celsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
