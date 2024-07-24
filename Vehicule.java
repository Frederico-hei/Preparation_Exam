package org.Exam_prepa;

public class Vehicule {
    private String modele;
    private String immatriculation;
    private String kilomtrage;
    private double poids_a_vide;
    private double longeur;
    private double reserve_de_carburant;
    Conducteur conducteur;

    public Vehicule(String modele, String immatriculation, String kilomtrage, double poids_a_vide, double longeur, double reserve_de_carburant, Conducteur conducteur) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.kilomtrage = kilomtrage;
        this.poids_a_vide = poids_a_vide;
        this.longeur = longeur;
        this.reserve_de_carburant = reserve_de_carburant;
        this.conducteur = conducteur;
    }
}
