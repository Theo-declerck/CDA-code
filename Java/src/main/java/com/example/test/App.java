package com.example.test;


import java.time.LocalDate;

import com.example.test.Model.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee1=new Employee("Daleux", "Jean", "2000-04-27", "Salariee", 15000, "Comptable");
        Employee employee2=new Employee("Coller", "Yve", "1998-12-31", "Salariee", 13000, "Comptable");
        Employee employee3=new Employee("Konstat", "Pierre", "2001-05-16", "Salariee", 12000, "Comptable");
        Employee employee4=new Employee("Sofirat", "Marie", "2016-08-28", "Avocate", 18000, "Droit");
        Employee employee5=new Employee("Reporter", "Albert", "2012-01-12", "Concierge", 11000, "Propreté");
        LocalDate aujourdhui = LocalDate.now();
        LocalDate voulu = LocalDate.of(2000,11,06);
        int m1 = aujourdhui.getDayOfMonth();
        int m2 = voulu.getDayOfMonth();
        int a1 = aujourdhui.getMonthValue();
        int a2 = voulu.getMonthValue();
        if(( m1 == m2  &&  a1 == a2  )){
            System.out.println("hey");
        }
        System.out.println(employee1);
        employee1.prime();

    }
}
