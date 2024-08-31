import java.util.ArrayList;
import java.util.Arrays;

public class arrayList {
    public static void main(String []arg){
        ArrayList<String> lista = new ArrayList<>();
        //inyectar varios valores a la vez
        lista.addAll(Arrays.asList("Elemento 1", "Elemento 2", "Elemento 3"));
        // agregar un elemento al final de la fila
        lista.add("hola mundo");
        //remplazar un elemento segun su indice
        lista.set(2, "tuki");
        //eliminar un elemento
        lista.remove(0);
        //indice del array
        int index = lista.size();
        //obtener un elemento segun su indice
        String indexTwo = lista.get(2);
        //verificar si la lista tiene un elemento en especifico
        boolean elem = lista.contains("hola");
        System.out.println(elem);
        System.out.println(index + indexTwo);

    }
}
