package com.example.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import com.example.test.Model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Agences Agence1 = new Agences("agence1", "Agence1", "Agence1", "Agence1", true);
        Agences Agence2 = new Agences("agence2", "agence2", "agence2", "agence2", false);
        Agences Agence3 = new Agences("agence3", "agence3", "agence3", "agence3", true);
        Agences Agence4 = new Agences("agence4", "agence4", "agence4", "agence4", false);   
        Directeur dir1= new Directeur("Succi", "Bastien", "2004-05-19", "Directeur", 100000, "Direction", Agence1, 0, 0, 0);
        Employee employee1 = new Employee("Daleux", "Jean", "2000-04-27", "Salariee", 15000, "Comptable",Agence1,6,0,2);
        Employee employee2 = new Employee("Coller", "Yve", "1998-12-31", "Salariee", 13000, "Comptable",Agence2,2,0,0);
        Employee employee3 = new Employee("Konstat", "Pierre", "2001-05-16", "Salariee", 12000, "Comptable",Agence3,2,4,0);
        Employee employee4 = new Employee("Sofirat", "Marie", "2016-08-28", "Avocate", 18000, "Droit",Agence4,2,0,1);
        Employee employee5 = new Employee("Reporter", "Albert", "2024-01-12", "Concierge", 11000, "Propreté",Agence1,2,0,0);
        LocalDate aujourdhui = LocalDate.now();
        LocalDate voulu = LocalDate.of(2000, 11, 06);
        int m1 = aujourdhui.getDayOfMonth();
        int m2 = voulu.getDayOfMonth();
        int a1 = aujourdhui.getMonthValue();
        int a2 = voulu.getMonthValue();
        ArrayList<Employee> tableauEmployee = new ArrayList<Employee>();
        tableauEmployee.add(employee1);
        tableauEmployee.add(employee2);
        tableauEmployee.add(employee3);
        tableauEmployee.add(employee4);
        tableauEmployee.add(employee5);
        tableauEmployee.add(dir1);
        Collections.sort(tableauEmployee);
        System.out.println(tableauEmployee);
        System.out.println("Il y a " + tableauEmployee.size() + " employés dans l'entreprise.");
        double total = 0;
        for (int i = 0; i < tableauEmployee.size(); i++) {
            System.out.println("--------------------------------------");
            System.out.println(tableauEmployee.get(i).getPrenom() + " a " + tableauEmployee.get(i).Temps() + " années dans l'entreprise");
            double prime = tableauEmployee.get(i).prime();
            double salaire = tableauEmployee.get(i).getSalaire();
            tableauEmployee.get(i).chequenoel();
            total+=prime+salaire;
            if(tableauEmployee.get(i).getIdAgence().isRestau()){
                System.out.println("Vous ne bénéficiez pas de tickets restaurants");
            }else{
                System.out.println("Vous pouvez bénéficier de tickets restaurants!! Youpii!");
            }
            if ((m1 == m2 && a1 == a2)) {
                System.out.println(prime);         
            } else {
                System.out.println("non");
            }
            if(i == tableauEmployee.size()-1){
                System.out.println("Masse salarial "+total+" euros");
            }

        }
        
        

    }
}
