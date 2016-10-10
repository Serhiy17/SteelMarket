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

public class PersonServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("person.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String surName = req.getParameter("surName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        Person person = new Person(name, surName, email, password);
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();

        manager.persist(person);

        manager.getTransaction().commit();
        manager.close();
        factory.close();

        req.getRequestDispatcher("index.jsp").forward(req, resp);

       }
}

