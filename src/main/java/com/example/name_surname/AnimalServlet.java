package com.example.name_surname;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

@WebServlet("/animalform")
public class AnimalServlet extends HttpServlet {

    public static final String VIEW = "/animalform.jsp";

    Animal animal = new Animal();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("animal",animal);

        RequestDispatcher view = request.getRequestDispatcher(VIEW);
        view.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        animal.setName(request.getParameter("name"));
        animal.setBreed(request.getParameter("breed"));
        animal.setGender(request.getParameter("gender"));
        animal.setAge(Integer.parseInt(request.getParameter("age")));

        System.out.println(animal.getName());
        System.out.println(animal.getBreed());
        System.out.println(animal.getGender());
        System.out.println(animal.getAge());

    }
}
