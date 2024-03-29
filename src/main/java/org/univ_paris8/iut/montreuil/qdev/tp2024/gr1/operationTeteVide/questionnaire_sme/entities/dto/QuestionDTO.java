package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;

import java.util.Objects;

public class QuestionDTO {

    private int numQuestion;
    private Langue langue;
    private String libelle;
    private String reponse;
    private Difficulte difficulte;
    private String explication;
    private String reference;



    public QuestionDTO(int numQuestion, Langue langue, String libelle, String reponse, Difficulte difficulte, String explication, String reference){
        this.numQuestion = numQuestion;
        this.langue = langue;
        this.libelle = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.reference = reference;
    }

    public int getNumQuestion() {
        return numQuestion;
    }

    public Langue getLangue() {
        return langue;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public Difficulte getDifficulte() {
        return difficulte;
    }

    public String getExplication() {
        return explication;
    }

    public String getReference() {
        return reference;
    }

    public void setNumQuestion(int numQuestion) {
        this.numQuestion = numQuestion;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public void setDifficulte(Difficulte difficulte) {
        this.difficulte = difficulte;
    }

    public void setExplication(String explication) {
        this.explication = explication;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "numQuestion=" + numQuestion +
                ", langue='" + langue + '\'' +
                ", libelle='" + libelle + '\'' +
                ", reponse='" + reponse + '\'' +
                ", difficulte=" + difficulte +
                ", explication='" + explication + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionDTO that = (QuestionDTO) o;
        return Objects.equals(libelle, that.libelle) && Objects.equals(reponse, that.reponse) && Objects.equals(explication, that.explication) && Objects.equals(reference, that.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libelle, reponse, explication, reference);
    }
}
