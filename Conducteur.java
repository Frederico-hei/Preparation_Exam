package org.Exam_prepa;

import java.util.Date;

public class Conducteur extends Voyageur{
    private String numero_de_permis;

    public Conducteur(String nom, String prenom, Date date_de_naissance, String adresse, double poids, Date date_de_voyage, String numero_de_permis) {
        super(nom, prenom, date_de_naissance, adresse, poids, date_de_voyage);
        this.numero_de_permis = numero_de_permis;
    }
}
