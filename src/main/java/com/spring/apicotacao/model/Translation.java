package com.spring.apicotacao.model;

import javax.xml.crypto.Data;

public class Translation {
    private String apiKey;
    private String targetLanguage;
    private String text;
    private String data;
    private String translatedText;
    private String source;

    public Translation() {
    }

    public Translation(String apiKey, String sourceLanguage, String targetLanguage, String text) {
        this.apiKey = apiKey;
        this.targetLanguage = targetLanguage;
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTranslatedText() {
        return translatedText;
    }

    public void setTranslatedText(String translatedText) {
        this.translatedText = translatedText;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getData() {
        return data;
    }
}
