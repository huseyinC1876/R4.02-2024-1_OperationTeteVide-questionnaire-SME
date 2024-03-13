package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.FileNotAvailableException;

public interface IQuestionnaire {

    public QuestionnaireDTO chargerQuestionnaire(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException;
}
