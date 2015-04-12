package pl.parkujznami.parkujpl_mobile.models.parking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import pl.parkujznami.parkujpl_mobile.models.shared.Coords;

public class Parking {

    @Expose
    private Integer id;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @Expose
    private String name;
    @Expose
    private String price;
    @Expose
    private Integer spots;
    @Expose
    private String address;
    @Expose
    private Coords coords;
    @SerializedName("max_parking_time")
    @Expose
    private Integer maxParkingTime;
    @Expose
    private String distance;
    @Expose
    private Availabilty availabilty;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * @param cityId The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return The spots
     */
    public Integer getSpots() {
        return spots;
    }

    /**
     * @param spots The spots
     */
    public void setSpots(Integer spots) {
        this.spots = spots;
    }

    /**
     * @return The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return The coords
     */
    public Coords getCoords() {
        return coords;
    }

    /**
     * @param coords The coords
     */
    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    /**
     * @return The maxParkingTime
     */
    public Integer getMaxParkingTime() {
        return maxParkingTime;
    }

    /**
     * @param maxParkingTime The max_parking_time
     */
    public void setMaxParkingTime(Integer maxParkingTime) {
        this.maxParkingTime = maxParkingTime;
    }

    /**
     * @return The distance
     */
    public String getDistance() {
        return distance;
    }

    /**
     * @param distance The distance
     */
    public void setDistance(String distance) {
        this.distance = distance;
    }

    /**
     * @return The availabilty
     */
    public Availabilty getAvailabilty() {
        return availabilty;
    }

    /**
     * @param availabilty The availabilty
     */
    public void setAvailabilty(Availabilty availabilty) {
        this.availabilty = availabilty;
    }

}