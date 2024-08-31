//? importacion de herramienta de entrada de datos
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        //? Tipos de datos
        String name = "Hector";
        int age = 23;
        double price = 15.5;
        float price2 = 15.7f;
        boolean vorf = true;

        //? inicializacion de Scanner
        Scanner sc = new Scanner(System.in);

        //? Forma de mostrar algo en consola
        System.out.println("Escribe tu nombre");

        //? se instancia sc con nextLine para strint y nextInt para enteros
        name = sc.nextLine();

        System.out.println("Escribe tu Edad");
        age = sc.nextInt();


        //! condicionales
        if (age >= 18) {
            System.out.println(name + " puedes entrar al bar");
        } else {
            System.out.println(name + " no puedes entrar al bar");
        }

        System.out.println("Que dia es hoy?");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("hoy no esta abierto el negocio y el precio de la cerveza es: " + price);
                break;
            case 2:
                System.out.println("hoy no esta abierto el negocio y el precio de la cerveza es: " + price);
                break;
            case 3:
                System.out.println("hoy si esta abierto el negocio y el precio de la cerveza es: " + price2);
                break;
            case 4:
                System.out.println("hoy si esta abierto el negocio y el precio de la cerveza es: " + price);
                break;
            case 5:
                System.out.println("hoy si esta abierto el negocio");
                break;
            default:
                break;
        }

        sc.close();
    }
}