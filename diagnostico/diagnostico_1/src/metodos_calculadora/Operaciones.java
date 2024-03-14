package metodos_calculadora;

public class Operaciones {
    public double suma(double num_a, double num_b){
        return num_a + num_b;
    }
    public double resta(double num_a, double num_b){
        return num_a - num_b;
    }
    public double multiplicacion(double num_a, double num_b){
        return num_a * num_b;
    }
    public String divicion(double num_a, double num_b){
        if (num_b == 0){
            return "no se puede dividir por 0";
        }
        return "El resultado es = " + num_a / num_b;
    }
}
