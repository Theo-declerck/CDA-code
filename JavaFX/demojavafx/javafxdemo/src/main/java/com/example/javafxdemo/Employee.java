package com.example.javafxdemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// import java.time.LocalDate;
// import java.time.temporal.ChronoUnit;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee implements Comparable<Employee> {
    private StringProperty nom;
    private StringProperty prenom;
    private StringProperty date;
    private StringProperty poste;
    private IntegerProperty salaire;
    private StringProperty service;

    public Employee(String nom, String prenom, String date, String poste,
            Integer salaire, String service) {
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.date = new SimpleStringProperty(date);
        this.poste = new SimpleStringProperty(poste);
        this.salaire = new SimpleIntegerProperty(salaire);
        this.service = new SimpleStringProperty(service);
    }

    @Override
    public String toString() {
        return "Employee [nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", poste=" + poste + ", salaire="
                + salaire + ", service=" + service + "]";
    }

    public String getNom() {
        return this.nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return this.prenom.get();
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public long getDate() {
        LocalDate currentdate = LocalDate.now();
        String dateconv = this.date.get();
        LocalDate finaldate = LocalDate.parse(dateconv);
        long diff = ChronoUnit.DAYS.between(finaldate, currentdate) / 365;

        return diff;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getPoste() {
        return this.poste.get();
    }

    public void setPoste(String poste) {
        this.poste.set(poste);
    }

    public int getSalaire() {
        return this.salaire.get();
    }

    public void setSalaire(int salaire) {
        this.salaire.set(salaire);
    }

    public String getService() {
        return this.service.get();
    }

    public void setService(String service) {
        this.service.set(service);
    }

    // public long Temps() {

    // }

    // public String chequevacances() {
    // if (Temps() > 1) {
    // String chequevalue = "L'employé peux disposer de chèque vacances \n";
    // System.out.print(chequevalue);
    // return chequevalue;
    // } else {
    // String chequevalue = "L'employé ne dispose pas de chèque vacances \n";
    // System.out.print(chequevalue);
    // return chequevalue;
    // }

    // }

    // public double prime() {
    // double ans = salaire * 0.05;
    // double ancien = ((salaire * 0.02) * Temps());
    // double totalprime = ans + ancien;
    // this.chequevacances();
    // return totalprime;
    // }

    // public void chequenoel() {
    // if (enfant0a10 > 0 || enfant11a15 > 0 || enfant16a18 > 0) {
    // if (enfant0a10 > 0) {
    // System.out.println("Vous avez le droit à " + enfant0a10 + " chèques de
    // 20euros");
    // } else {

    // }
    // if (enfant11a15 > 0) {
    // System.out.println("Vous avez le droit à " + enfant11a15 + " chèques de
    // 30euros");
    // } else {

    // }
    // if (enfant16a18 > 0) {
    // System.out.println("Vous avez le droit à " + enfant16a18 + " chèques de
    // 50euros");
    // } else {

    // }
    // }

    // }

    @Override
    public int compareTo(Employee e) {
        int compareNom = this.getNom().compareTo(e.getNom());
        int ComparePre = this.getPrenom().compareTo(e.getPrenom());
        int compareServ = this.getService().compareTo(e.getService());
        if (compareServ == 0) {
            if (compareNom == 0) {
                return ComparePre;
            } else {
                return compareNom;
            }

        } else {
            return compareServ;
        }
    }
}
