public class Car {
    String name;
    int v;
    int gruz;

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
}
