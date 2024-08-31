import java.util.Scanner;
//Crear un programa que detecte si un numero es primo o no
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa verifica si tu numero es primo o no");
        String finish = "S";

        do {
            System.out.println("Me puedes brindar ese numero aca:");
            int num = sc.nextInt();
            String calculo = isPrim(num);
            System.out.println(calculo);
            finish = finished();

        }while (finish.equals("S"));


    }

    public static String isPrim(int num){
        if (num > 1){
            for (int i = 2; i < num-1; i++) {
                if (num % i == 0){
                    return "El numero ingresado no es primo";
                }
            }
            return "El numero ingresado es primo";
        }else{
            return "El numero ingresado no es primo";
        }
    }

    public static String finished(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres consultar otro numero?(S/N)");
        return sc.nextLine();
    }
}