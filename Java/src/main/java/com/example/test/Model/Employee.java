package com.example.test.Model;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String nom;
    private String prenom;
    private String date;
    private String poste;
    private int salaire;
    private String service;

    @Override
    public String toString() {
        return "Employee [nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", poste=" + poste + ", salaire="
                + salaire + ", service=" + service + "]";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Employee(String nom, String prenom, String date, String poste, int salaire, String service) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.poste = poste;
        this.salaire = salaire;
        this.service = service;
    }

    public long Temps() {
        LocalDate currentdate = LocalDate.now();
        String dateconv= this.date;
        LocalDate finaldate=LocalDate.parse(dateconv);     
        long diff = ChronoUnit.DAYS.between(finaldate, currentdate)/365 ;
        System.out.println(prenom +" a " + diff + " années dans l'entreprise");
        return diff;
    }

    public void prime(){
        this.Temps();
        double ans = salaire * 0.05;
        double ancien = ((salaire*0.02) * Temps());
        double totalprime = ans + ancien ;
        System.out.println(totalprime + " euros versée a "+ prenom +" "+ nom + " le 30/11");
        
    }
}
