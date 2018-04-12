package parking_lot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {

    @JsonProperty("CarParkID")
    private String carParkID;

    @JsonProperty("Area")
    private String area;

    @JsonProperty("Development")
    private String development;

    @JsonProperty("AvailableLots")
    private int availableLots;

    @JsonProperty("LotType")
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
