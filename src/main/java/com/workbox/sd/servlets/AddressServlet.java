package com.workbox.sd.servlets;

import com.workbox.sd.entity.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddressServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("address.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        String sity = req.getParameter("sity");
        String street = req.getParameter("street");
        String number = req.getParameter("number");
        String zipCode = req.getParameter("zipCode");

        manager.persist(new Address(sity, street, Integer.parseInt(number), Integer.parseInt(zipCode)));

        manager.getTransaction().commit();
        manager.close();
        factory.close();

        //req.setAttribute("allCommodities", persons);
//	System.out.println(name + " " + price + " " + weight);

        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
