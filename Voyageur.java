package org.Exam_prepa;

import java.util.Date;

public class Voyageur extends Personne{
    private Date date_de_voyage;

    public Voyageur(String nom, String prenom, Date date_de_naissance, String adresse, double poids, Date date_de_voyage) {
        super(nom, prenom, date_de_naissance, adresse, poids);
        this.date_de_voyage = date_de_voyage;
    }
}
