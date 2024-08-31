import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime cual numero deseas su tabla de multiplicar: ");

        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar con el bucle for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("Tabla de multiplicar con el bucle while");
        int multiplicador = 0;
        while (multiplicador < 10) {
            multiplicador++;
            System.out.println(num + " x " + multiplicador + " = " + (num * multiplicador));
        }
        
        System.out.println("Tabla de sumar con el bucle do while");
        int sumador = 0;
        do{
            sumador++;
            System.out.println(num + " + " + sumador + " = " + (num + sumador));
        }while(sumador < 10);

        sc.close();
    }
}
