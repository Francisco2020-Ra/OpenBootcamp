package SecondPart;


public class SecondPart {
    public static void main(String[] args) {
        Car car = new Car();
        car.setDoor(1);
        car.incrementDoors();
        System.out.println(car.getDoor());
    }
}

class Car {
    private int door;

    public void setDoor(int door) {
        this.door = door;
    }

    public int getDoor() {
        return this.door;
    }

    public void incrementDoors() {
        door++;
    }
}
