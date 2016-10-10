package com.workbox.sd.servlets;

import com.workbox.sd.entity.MetalProfile;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProfileServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("profile.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String typeOfProfile = req.getParameter("typeOfProfile");
        String dimensions = req.getParameter("dimensions");
        String weight = req.getParameter("weight");
        String length = req.getParameter("length");
        String price = req.getParameter("price");
        String gost = req.getParameter("gost");

        MetalProfile metalProfile = new MetalProfile(typeOfProfile, dimensions, Double.parseDouble(weight),
                Double.parseDouble(length), Double.parseDouble(price), gost);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(metalProfile);

        manager.getTransaction().commit();
        manager.close();
        factory.close();

        req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
