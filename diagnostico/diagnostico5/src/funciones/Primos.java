package funciones;

public class Primos {
    public void saber_primo (int num){
        boolean condicional = false;
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                contador++;
            }
            if (contador > 2){
                condicional = true;
                break;
            }
        }
        if (!condicional){
            System.out.println(num + " Es un numero primo");
        }
    }
}
