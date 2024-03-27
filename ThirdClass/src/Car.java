public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean isMatic;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isMatic() {
        return isMatic;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        if(make == null) make = "Unknown";

        String lowercaseMake = make.toLowerCase();

        switch (lowercaseMake){
            case "toyota", "honda", "hyundai" -> this.make = make;
            default -> {
                this.make = "Unsuported";
            }
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setMatic(boolean matic) {
        isMatic = matic;
    }

    public void describeCar() {
        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (isMatic ? "Mobil Matic" : "Mobil Manual"));
    }
}
