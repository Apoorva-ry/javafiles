public class Car {
    String make;
    String model;
    int year;

    public Car() {
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println();

        Car car2 = new Car("Toyota", "Corolla", 2020);
        car2.displayDetails();
    }
}
