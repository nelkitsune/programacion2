public class Main {
    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepción");
            }
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }
    public static void main(String[] args) {
        System.out.println(devuelveNumero(1));
    }
    //este codigo llama a una funcion la cual trata de verificar si un numero es par o no. Si es par el codigo devuelve 1, si no lo es devuelve dos. y esto con una sentencia try catch
    //el chiste de esto radica que el finally se ejecuta pese a que los return se hubieran ejecutado antes, y esto permite que el finally sobre escribra el return

    //2
    //la clase base para todas las excepciones es Throwable

    //3
    //En Java, la clase que representa las excepciones que se producen al invocar un método de un objeto cuyo valor es null se llama NullPointerException.

    //4 La clase en Java que representa las excepciones que se producen al obtener un comportamiento anómalo en la entrada/salida de información es IOException

    //5 El método printStackTrace() en Java proporciona una forma detallada de imprimir la traza de la pila de una excepción. Esta traza muestra la secuencia de métodos que se han llamado hasta el punto donde se lanzó la excepción.
    
}