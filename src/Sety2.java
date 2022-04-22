import java.util.HashSet;
import java.util.Set;

public class Sety2 {

    public static void main(String[] args) {
        Car car1 = new Car("fiat", "bravo", 2008);
        Car car2 = new Car("fiat", "bravo", 2008);
        Car car3 = new Car("fiat", "bravo", 2008);
        Set<Car> carSet= new HashSet<>();
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);
        System.out.println(carSet); //bez metody equals w car drukuje 3 razy ten sam, a z mamy juz 1 bo wie ze sa takie same
    }
}
