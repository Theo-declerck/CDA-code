package com.example.javafxdemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee implements Comparable<Employee> {
    private String nom;
    private String prenom;
    private String date;
    private String poste;
    private int salaire;
    private String service;
    private Agences idAgence;
    private int enfant0a10;
    private int enfant11a15;
    private int enfant16a18;

    public Employee(String nom, String prenom, String date, String poste, int salaire, String service, Agences idAgence,
            int enfant0a10, int enfant11a15, int enfant16a18) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.poste = poste;
        this.salaire = salaire;
        this.service = service;
        this.idAgence = idAgence;
        this.enfant0a10 = enfant0a10;
        this.enfant11a15 = enfant11a15;
        this.enfant16a18 = enfant16a18;
    }

    public  Agences getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(Agences idAgence) {
        this.idAgence = idAgence;
    }

    public int getEnfant0a10() {
        return enfant0a10;
    }

    public void setEnfant0a10(int enfant0a10) {
        this.enfant0a10 = enfant0a10;
    }

    public int getEnfant11a15() {
        return enfant11a15;
    }

    public void setEnfant11a15(int enfant11a15) {
        this.enfant11a15 = enfant11a15;
    }

    public int getEnfant16a18() {
        return enfant16a18;
    }

    public void setEnfant16a18(int enfant16a18) {
        this.enfant16a18 = enfant16a18;
    }

    @Override
    public String toString() {
        return "Employee [nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", poste=" + poste + ", salaire="
                + salaire + ", service=" + service + ", idAgence=" + idAgence + ", enfant0a10=" + enfant0a10
                + ", enfant11a15=" + enfant11a15 + ", enfant16a18=" + enfant16a18 + ", chequeVac=" + "]";
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

    public long Temps() {
        LocalDate currentdate = LocalDate.now();
        String dateconv = this.date;
        LocalDate finaldate = LocalDate.parse(dateconv);
        long diff = ChronoUnit.DAYS.between(finaldate, currentdate) / 365;
        
        return diff;
    }

    public String chequevacances() {
        if (Temps() > 1) {
            String chequevalue = "L'employé peux disposer de chèque vacances \n";
            System.out.print(chequevalue);
            return chequevalue;
        } else {
            String chequevalue = "L'employé ne dispose pas de chèque vacances \n";
            System.out.print(chequevalue);
            return chequevalue;
        }

    }

    public double prime() {
        double ans = salaire * 0.05;
        double ancien = ((salaire * 0.02) * Temps());
        double totalprime = ans + ancien;
        this.chequevacances();
        return totalprime;
    }
    public void chequenoel(){
        if(enfant0a10>0||enfant11a15>0 ||enfant16a18>0){
            if(enfant0a10>0){
                System.out.println("Vous avez le droit à "+ enfant0a10 + " chèques de 20euros");
            }else{

            }
            if(enfant11a15>0){
                System.out.println("Vous avez le droit à "+ enfant11a15 + " chèques de 30euros");
            }else{
                
            }
            if(enfant16a18>0){
                System.out.println("Vous avez le droit à "+ enfant16a18 + " chèques de 50euros");
            }else{
                
            }
        }

    }

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
