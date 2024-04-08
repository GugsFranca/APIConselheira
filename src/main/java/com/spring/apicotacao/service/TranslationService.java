package com.spring.apicotacao.service;

import com.spring.apicotacao.model.Translation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TranslationService {
    @Autowired
    private TranslationAPI languageTranslationClient;
    @Value("${translation.api.key}")
    private String apiKey;

    public String translateText(String text, String targetLanguage) {
        String apiKey = "f6RsaoycwfcjKwPN83lcNYetXCdKINow";
        Translation translation = languageTranslationClient.translate(apiKey, targetLanguage, text);
        return translation.getTranslatedText();
    }
}
