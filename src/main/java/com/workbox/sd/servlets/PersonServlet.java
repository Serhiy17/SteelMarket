package com.workbox.sd.servlets;

import com.workbox.sd.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PersonServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("person.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {



        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        String name = req.getParameter("name");
        String surName = req.getParameter("surName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String balanse = req.getParameter("balanse");

        manager.persist(new Person(name, surName, email, password, Double.parseDouble(balanse)));

        manager.getTransaction().commit();
        manager.close();
        factory.close();

        //req.setAttribute("allCommodities", persons);
//	System.out.println(name + " " + price + " " + weight);

        req.getRequestDispatcher("index.jsp").forward(req, resp);

       }
}

