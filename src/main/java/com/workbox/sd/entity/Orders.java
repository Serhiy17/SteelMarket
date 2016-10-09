package com.workbox.sd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private double totalPrice;

    @ManyToOne
    private Person user;

    @ManyToMany
    @JoinTable(name = "order_profile",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_profile"))
    private List<MetalProfile> metalProfiles;

    public Orders() {
        // TODO Auto-generated constructor stub
    }

    public Orders(double totalPrice) {
        super();
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public List<MetalProfile> getCommodityes() {
        return metalProfiles;
    }

    public void setCommodityes(List<MetalProfile> chanels) {
        this.metalProfiles = chanels;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", totalPrice=" + totalPrice + "]";
    }


}
