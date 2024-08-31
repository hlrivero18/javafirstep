import  java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este Programa detecta la secuencia de numeros\n Fibonacci hasta el numero ingresado");

        String finish = "S";

        do {
            System.out.println("Ingresa un numero: ");
            int num = sc.nextInt();
            ArrayList<Integer> secuencia = fibonacci(num);
            System.out.println(secuencia);
            finish = finished();
        }while(finish.equals("S"));

    }

    public static ArrayList<Integer> fibonacci(int num){
        ArrayList<Integer> secuencia = new ArrayList<>();
        secuencia.add(0);
        int num1 = 0, num2 = 1;

        if (num == 0){
           return secuencia;
        }else{
            secuencia.add(1);
            for (int i = 2; i < num+10; i++) {
                if (secuencia.getLast() == num) {
                    break;
                }
                int numAdd = num1 + num2;
                if (numAdd > num){
                    break;
                }
                secuencia.add(numAdd);
                num1 = num2;
                num2 = numAdd;
            }

        }
        return secuencia;
    }
    public static String finished(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres consultar otro numero?(S/N)");
        return sc.nextLine();
    }
}