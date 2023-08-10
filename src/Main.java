import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList=new ArrayList<>();
        Car car1=new Car("Volvo",59,1000);
        Car car2=new Car("Mazda",45,950);
        Car car3=new Car("Toyota", 40,1200);
        Car car4=new Car("Lada",48,850);
        Car car5=new Car("Volvo",59,1000);
        Car car6 =new Car("Mazda",45,950);
        Car car7=new Car("Toyota", 40,1200);
        Car car8=new Car("Lada",48,850);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);
        carArrayList.add(car4);
        carArrayList.add(car5);
        carArrayList.add(car6);
        carArrayList.add(car7);
        carArrayList.add(car8);
        System.out.println(carArrayList);
        carArrayList.sort((a1,a2)->Integer.compare(a1.getV(), a2.getV()));
        carArrayList.sort((x,y)->x.v - y.v); //альтернативное решение того что выше
        System.out.println(carArrayList);
        carArrayList.sort((a1,a2)->Integer.compare(a1.getGruz(), a2.getGruz()));
        System.out.println(carArrayList);
        carArrayList.sort((b1,b2)->b1.getName().compareTo(b2.getName()));
        carArrayList.sort((x,y)->x.name.compareTo(y.name)); //альтернативное решение того что выше
        System.out.println(carArrayList);

        Set<Car> uniqCars=new HashSet<>();
        for (Car z:carArrayList) {
            uniqCars.add(z);
        }

        System.out.println("количество разных строк: "+uniqCars.size());
        System.out.println(uniqCars);

        TreeSet<Car> car2Set = new TreeSet<>();
        car2Set.addAll(carArrayList);
        System.out.println("количество разных Car2: "+car2Set.size());
        System.out.println(car2Set);
    }


}
