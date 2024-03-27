public class Main {
    public static void main(String[] args) {
        Car car = new Car();;

        car.setColor("Blue");
        car.setMake("honda");
        car.setModel("Brio");
        car.setMatic(true);
        car.setDoors(4);

        car.describeCar();

        System.out.println("the color is " + car.getColor());

        System.out.println("The car model is " + car.getModel());

        Car mobil = new Car();

        mobil.describeCar();
    }

}