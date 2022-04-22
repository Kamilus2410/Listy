import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Wieluń");
        lista.add("Wrocław");
        lista.add("Warszawa");
        System.out.println(lista);
        lista.add(1, "Wieruszów");
        System.out.println(lista);
        System.out.println(lista.get(1));
//        System.out.println(lista.get(4));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains("Wieluń"));
        lista.remove("Warszawa");
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        System.out.println(lista.remove("Warszawa"));
        System.out.println(lista);
        Object[] array = lista.toArray();  //tworzy tablice obiektów
        System.out.println(Arrays.toString(array));
        String[] arrayString = lista.toArray(new String[0]); //tworzy tablice stringów
        System.out.println(Arrays.toString(arrayString));

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); //jest jeszcze previous
        }
    }
}
