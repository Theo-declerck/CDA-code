package com.example.test.Model;

public class Agences {
    private String nom;
    private String adresse;
    private String code;
    private String ville;
    public static int id;
    public boolean restau ;

    public Agences(String nom, String adresse, String code, String ville, boolean restau) {
        this.nom = nom;
        this.adresse = adresse;
        this.code = code;
        this.ville = ville;
        this.restau = restau;
    }

    public boolean isRestau() {
        return restau;
    }

    public void setRestau(boolean restau) {
        this.restau = restau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Agences.id = id;
    }


    @Override
    public String toString() {
        return "Agences [nom=" + nom + ", adresse=" + adresse + ", code=" + code + ", ville=" + ville + ", restau="
                + restau + "]";
    }

  

}
