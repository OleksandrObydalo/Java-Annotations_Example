package override_with_error;

public class Car {
    private String licensePlate = "Plate";

    // getters and setters ...
    @Override
    public String toString() {
        return licensePlate.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(new Car());
    }
}

