package com.workbox.sd.servlets;

import com.workbox.sd.entity.MetalProfile;
import com.workbox.sd.entity.Orders;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OrdersServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("orders.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String totalPrice = req.getParameter("totalPrice");
        double tp = Double.parseDouble(totalPrice);
        Orders order = new Orders(tp);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(order);

        manager.getTransaction().commit();
        manager.close();
        factory.close();

//        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
