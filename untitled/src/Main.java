
public class Main {

    public static void main(String[] args) {
        int [] list = asigancion(10);
        int sumaAllElement = joinAllElement(list);
        System.out.println(printAll(list));
        System.out.println(sumaAllElement);
    }

    public static  int[] asigancion(int indice){
        int[] list = new int[indice];
        for (int i = 0; i < list.length; i++){
            if(i == 0){
                list[i] = 2;
            }else{
                list[i] = list[i -1] + 2;
            }

        }
        return list;
    }
    public static int joinAllElement(int[] list){
        int sumar = 0;
        for (int i = 0; i < list.length; i++) {
            sumar += list[i];
        }
        return sumar;
    }
    public static String printAll (int[] list){
        String cadena = String.valueOf(list[0]);
        for (int i = 1; i < list.length; i++) {
            cadena += ", " + list[i];
        }
        return cadena;
    }
}