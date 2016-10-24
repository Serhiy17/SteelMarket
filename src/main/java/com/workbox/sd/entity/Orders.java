package com.workbox.sd.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private double totalPrice;

    @ManyToOne
    private Person person;

    @OneToMany(mappedBy = "orders")
    private List<PieceOfOrder> pieceOfOrders;

    public Orders() {
        // TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalPrice() {

        for(PieceOfOrder p : pieceOfOrders){
            totalPrice += p.getPrice();
        }
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

    public List<PieceOfOrder> getPieceOfOrders() {
        return pieceOfOrders;
    }

    public void setPieceOfOrders(List<PieceOfOrder> pieceOfOrders) {
        this.pieceOfOrders = pieceOfOrders;
    }

    @Override
    public String toString() {
        return "Orders [id=" + id + ", totalPrice=" + totalPrice + "]";
    }


}
