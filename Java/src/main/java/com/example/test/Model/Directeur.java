package com.example.test.Model;

public class Directeur extends Employee {

    public Directeur(String nom, String prenom, String date, String poste, int salaire, String service, Agences idAgence,
            int enfant0a10, int enfant11a15, int enfant16a18) {
        super(nom, prenom, date, poste, salaire, service, idAgence, enfant0a10, enfant11a15, enfant16a18);

    }

    public double prime() {
        double ans = this.getSalaire() * 0.07;
        double ancien = ((this.getSalaire() * 0.03) * Temps());
        double totalprime = ans + ancien;
        this.chequevacances();
        return totalprime;
    }
}
