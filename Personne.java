package org.Exam_prepa;

import java.util.Date;

public class Personne {
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String adresse;
    private double poids;

    public Personne(String nom, String prenom, Date date_de_naissance, String adresse, double poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.adresse = adresse;
        this.poids = poids;
    }
}
