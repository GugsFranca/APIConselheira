package com.spring.apicotacao.service;

import com.spring.apicotacao.model.Translation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "language-translation-api", url = "https://api.apilayer.com//language_translation")
public interface TranslationAPI {
    @PostMapping("/translate")
    Translation translate(@RequestHeader("apiKey") String apiKey,
                          @RequestParam("target") String targetLanguage,
                          @RequestBody String text);

}
