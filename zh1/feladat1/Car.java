public class Car {

    private String licensePlateNumber;
    private String brand;
    private double weight;
    private String color;

    public Car(String licensePlateNumber, String brand, double weight, String color) {
        setLicensePlateNumber(licensePlateNumber);
        setBrand(brand);
        setWeight(weight);
        setColor(color);
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber.toUpperCase();
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber.toUpperCase();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLighterThan(Car masik) {
        if (this.weight >= masik.weight) {
            return false;
        } else {
            return true;
        }
    }

    public boolean requiresCLicense() {
        if (this.weight > 3.5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Car(%s (%s), %s, %.2ft)", this.brand, this.licensePlateNumber.toUpperCase(), this.color,
                this.weight);
    }
}