public class arreglos {
    public static void main(String []args){

        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i;
            System.out.println(numeros[i]);
        }

        String[] nombres = {"Ana", "Emilia", "Hector", "Karol"};
        nombres[2] = "Maria";
        System.out.println(nombres[2]);
    }
}
