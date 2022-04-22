import java.util.HashSet;
import java.util.Set;

public class Sety {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Wieluń");
        set1.add("Wrocław");
        set1.add("Ostrów");
        set1.add("Warszawa");
        set1.add("Warszawa");
        set1.add("Wieruszów");
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.contains("Wieluń"));
        System.out.println(set1.contains("Gdynia"));

        Set<String> set2 = new HashSet<>();
        set2.add("Wieluń");
        set2.add("Białystok");
        set2.add("Szczecin");
        set2.add("Zakopane");
        set2.add("Kalisz");
        set2.add("Kraków");
        System.out.println(set2);
        System.out.println(set2.size());

        Set<String> wszystkie = new HashSet<>(set1);
        wszystkie.addAll(set2);
        System.out.println(wszystkie);
        System.out.println(wszystkie.size());

        Set<String> common = new HashSet<>(set1);
        common.retainAll(set2); //przepisuje czesci wspolne
        System.out.println(common);

        Set<String> roznica = new HashSet<>(set1);
        roznica.removeAll(set2); //przepisuje tylko te ktore z set1 nie wystapily w set2
        System.out.println(roznica);

    }
}
