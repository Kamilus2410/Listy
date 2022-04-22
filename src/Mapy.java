import java.util.*;

public class Mapy {
    public static void main(String[] args) {
        Map<Integer, String> klasa = new HashMap<>();
        klasa.put(1, "Adamski");
        klasa.put(2, "Burski");
        klasa.put(5, "Cebulski");
        klasa.put(null, "nullski");
        System.out.println(klasa);
        klasa.put(null, null);
        System.out.println(klasa);

        Map<Integer, String> innaKlasa = new HashMap<>(klasa);
        System.out.println(innaKlasa);

        System.out.println("Get key: " + innaKlasa.get(5));
        System.out.println("Get key: " + innaKlasa.get(2));
        System.out.println(innaKlasa.size());
        innaKlasa.remove(5);
        System.out.println(innaKlasa);
        System.out.println(innaKlasa.size());
        System.out.println("containsKey: " + innaKlasa.containsKey(4));
        System.out.println("containsValue: " + innaKlasa.containsValue("Burski"));

        Map<Integer, List<String>> mapaList = new HashMap<>();
        mapaList.put(1, Arrays.asList("Adamski 1", "Adamski 2", "Adamski 3", "Adamski 4"));
        mapaList.put(2, List.of("Burski 1", "Burski 2", "Burski 3"));
        mapaList.put(3, Collections.emptyList());
        mapaList.put(4, Collections.singletonList("Duński"));
        System.out.println(mapaList);

        for (Integer integer : klasa.keySet()) {
            System.out.println(integer);
        }
        for (String value : klasa.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Integer, String> integerStringEntry : klasa.entrySet()) {
            System.out.println(integerStringEntry);
        }
        Iterator<Map.Entry<Integer, String>> iterator = klasa.entrySet().iterator(); //mapa nie ma  iteratora ale mozna zrobic tak
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
