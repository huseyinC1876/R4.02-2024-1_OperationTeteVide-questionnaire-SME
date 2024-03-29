package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.impl.questionnaire;

import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.entities.dto.QuestionnaireDTO;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.services.interfaces.IQuestionnaire;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Difficulte;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.enumerate.Langue;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.CannotReadFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.EmptyFileException;
import org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.questionnaire_sme.utils.exception.FileNotAvailableException;

import java.util.ArrayList;

public class IQuestionnaireImplMockOk implements IQuestionnaire {
    @Override
    public QuestionnaireDTO chargerQuestionnaire(String url) throws FileNotAvailableException, EmptyFileException, CannotReadFileException {

        QuestionDTO questionDTO1 = new QuestionDTO(1, Langue.FR, "Question test", "Reponse test", Difficulte.DIFFICILE, "Explication test", "Reference test");
        QuestionDTO questionDTO2 = new QuestionDTO(2, Langue.FR, "Question test1", "Reponse test2", Difficulte.INTERMEDIARE, "Explication test2", "Reference test2");
        QuestionDTO questionDTO3 = new QuestionDTO(3, Langue.FR, "Question test2", "Reponse test3", Difficulte.DIFFICILE, "Explication test3", "Reference test3");

        ArrayList<QuestionDTO> listeQuestions = new ArrayList<>();
        listeQuestions.add(questionDTO1);
        listeQuestions.add(questionDTO2);
        listeQuestions.add(questionDTO3);

        QuestionnaireDTO expectedQuestionnaireDTO = new QuestionnaireDTO(listeQuestions);
        return expectedQuestionnaireDTO;
    }
}
