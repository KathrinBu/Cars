import java.util.Objects;

public class Car implements Comparable<Car>{
    String name;
    int v;
    int gruz;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return v == car.v && gruz == car.gruz && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, v, gruz);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", v=" + v +
                ", gruz=" + gruz +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getGruz() {
        return gruz;
    }

    public void setGruz(int gruz) {
        this.gruz = gruz;
    }

    public Car(String name, int v, int gruz) {
        this.name = name;
        this.v = v;
        this.gruz = gruz;
    }



    @Override
    public int compareTo(Car o) {
        if (this.v ==o.v){
            if (this.gruz==o.gruz)
                return this.name.compareTo(o.name);
            else
                return this.v-o.v;
        } else
            return this.gruz-o.gruz;
    }
}
