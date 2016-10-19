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
    private Person person;

    @ManyToMany
    @JoinTable(name = "order_profile",
            joinColumns = @JoinColumn(name = "id_order"),
            inverseJoinColumns = @JoinColumn(name = "id_profile"))
    private List<Profile> profiles;

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
        return person;
    }

    public void setUser(Person user) {
        this.person = user;
    }

    public List<Profile> getCommodityes() {
        return profiles;
    }

    public void setCommodityes(List<Profile> chanels) {
        this.profiles = chanels;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", totalPrice=" + totalPrice + "]";
    }


}
