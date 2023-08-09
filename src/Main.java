import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList=new ArrayList<>();
        Car car1=new Car("Volvo",59,1000);
        Car car2=new Car("Mazda",45,950);
        Car car3=new Car("Toyota", 40,1200);
        Car car4=new Car("Lada",48,850);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        System.out.println(carArrayList);
        carArrayList.sort((a1,a2)->Integer.compare(a1.getV(), a2.getV()));
        System.out.println(carArrayList);
        carArrayList.sort((a1,a2)->Integer.compare(a1.getGruz(), a2.getGruz()));
        System.out.println(carArrayList);
        carArrayList.sort((b1,b2)->b1.getName().compareTo(b2.getName()));
        System.out.println(carArrayList);

    }


}
