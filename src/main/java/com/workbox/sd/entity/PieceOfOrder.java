package com.workbox.sd.entity;

import javax.persistence.*;

@Entity
public class PieceOfOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double price;
    private double length;

    @ManyToOne
    private Profile profile;

    @ManyToOne
    private Orders orders;

    public  PieceOfOrder(){

    }

    public PieceOfOrder(double length) {
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
        this.price = profile.getPrice()*this.length;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "PieceOfOrder{" +
                "id=" + id +
                ", price=" + price +
                ", length=" + length +
                '}';
    }
}
