
    public class Main {
        public static void main(String[] args) {
            PrimeNumberGenerator primeNumberGenerator = new PrimeNumberGenerator();

            System.out.println("Los 10 números primos entre 100 y 300 son:");
            for (int primeNumber : primeNumberGenerator) {
                System.out.println(primeNumber);
            }
        }
    }
