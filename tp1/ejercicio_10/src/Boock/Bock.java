package Boock;

public class Bock {
        private String titulo;
        private String autor;
        private double precio;


        public Bock(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public void imprimirInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Precio: $" + precio);
        }
    }
