public class Apartment {
    private int apartmentNum;
    private int bedroomNum;
    private int bathNum;
    private int rentAmount;

    public Apartment(int apartmentNum, int bedroomNum, int bathNum, int rentAmount) {
        this.apartmentNum = apartmentNum;
        this.bedroomNum = bedroomNum;
        this.bathNum = bathNum;
        this.rentAmount = rentAmount;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public int getBedroomNum() {
        return bedroomNum;
    }

    public int getBathNum() {
        return bathNum;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public void setBedroomNum(int bedroomNum) {
        this.bedroomNum = bedroomNum;
    }

    public void setBathNum(int bathNum) {
        this.bathNum = bathNum;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Apartment #" + apartmentNum + ": " +
                bedroomNum + " bedrooms, " + bathNum + " bathrooms, Rent: £" + rentAmount;
    }
}
