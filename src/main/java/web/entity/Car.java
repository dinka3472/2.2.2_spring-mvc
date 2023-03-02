package web.entity;

public class Car {
    private String colour;
    private int mileage;
    private String serialNumber;

    public Car() {
    }

    public Car(String colour, int mileage, String serialNumber) {
        this.colour = colour;
        this.mileage = mileage;
        this.serialNumber = serialNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "colour='" + colour + '\'' +
                ", mileage=" + mileage +
                ", serialNumber='" + serialNumber + '\'';
    }
}
