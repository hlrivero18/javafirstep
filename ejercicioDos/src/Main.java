import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este Programa detecta la secuencia de numeros\n Fibonacci hasta el numero ingresado\n Ingresa un numero: ");
        int num = sc.nextInt();

    }

    public static int[] fibonacci(int num){
        int[] secuencia = new int[num];
        secuencia[0] = 0;
        int registro = 0;
        for (int i = 1; i < secuencia.length; i++) {
            if (secuencia[1] == 0){
                secuencia[1] = 1;
            }else{
                secuencia[i] = secuencia[i - 2] + secuencia[i -1];
            }
        }

        return secuencia;
    }
}