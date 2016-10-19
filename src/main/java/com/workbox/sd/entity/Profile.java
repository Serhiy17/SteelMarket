package com.workbox.sd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String typeOfProfile; //type (Rebar, LProfileEquilateral, LProfileNonEquilateral,
                                // IBeamAdded, IBeamAngle, IBeamCol, IBeamNorm, IBeamWide,
                                // TBeamCol, TBeamWide, SquarePipe, RectangularPipe, CirclePipe,
                                // ChanelAngle, ChanelBend, ChanelParalel
    private String dimensions; //dimensions of profile depends of typeOfProfile
    private double weight; //weight kg by meter depends of dimensions
    private double length; //length of one unite of profile
    private double price; //price of meter of material
    private String gost; //standards

    @ManyToMany
    @JoinTable(name = "order_profile",
            joinColumns = @JoinColumn(name = "id_profile"),
            inverseJoinColumns = @JoinColumn(name = "id_order"))
    private List<Orders> orders;

    Profile() {

    }

    public Profile(String typeOfProfile, String dimensions, double weight, double length, double price, String gost) {
        this.typeOfProfile = typeOfProfile;
        this.dimensions = dimensions;
        this.weight = weight;
        this.length = length;
        this.price = price;
        this.gost = gost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfProfile() {
        return typeOfProfile;
    }

    public void setTypeOfProfile(String typeOfProfile) {
        this.typeOfProfile = typeOfProfile;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGost() {
        return gost;
    }

    public void setGost(String gost) {
        this.gost = gost;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", typeOfProfile='" + typeOfProfile + '\'' +
                ", dimensions='" + dimensions + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", price=" + price +
                ", gost='" + gost + '\'' +
                '}';
    }
}