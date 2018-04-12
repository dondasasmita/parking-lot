package parking_lot.model;

public class AvailableLots {

    private String carParkID;
    private String area;
    private String development;
    private int availableLots;
    private String lotType;

    public String getCarParkID() {
        return carParkID;
    }

    public void setCarParkID(String carParkID) {
        this.carParkID = carParkID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDevelopment() {
        return development;
    }

    public void setDevelopment(String development) {
        this.development = development;
    }

    public int getAvailableLots() {
        return availableLots;
    }

    public void setAvailableLots(int availableLots) {
        this.availableLots = availableLots;
    }

    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }
}
