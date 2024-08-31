public class Main {
    public static void main(String[] args) {
        Persona hector = new Persona("Hector", 22);
        System.out.println(hector.edad);
    }
    public static class Persona{
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }

        public String mostrarPersona(){
            return this.nombre + " tiene la edad de " + this.edad;
        }
    }
}