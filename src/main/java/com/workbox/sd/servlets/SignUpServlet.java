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

public class SignUpServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("signUp.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primery");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

//        if((email.equals("Dudynsky"))&&(password.equals("12s08d38u"))){
//            req.getRequestDispatcher("adminPage.jsp").forward(req, resp);
//        }else if(Person user =
//				(Person) manager.createQuery
//		("select u from Person u where u.email =?1 and u.password =?2")
//		.setParameter(1, email)
//		.setParameter(2, password)
//		.getSingleResult()){
//            req.getRequestDispatcher("workPage.jsp").forward(req, resp);
//        }else{
//            req.getRequestDispatcher("workPage.jsp").forward(req, resp);
//        }

        manager.getTransaction().commit();
        manager.close();
        factory.close();

    }
}
