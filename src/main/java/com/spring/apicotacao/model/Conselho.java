package com.spring.apicotacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Conselho {
    @Id
    private Integer slip_id;
    private String advice;

    public Conselho() {
    }

    public Conselho(Integer slip_id, String advice) {
        this.slip_id = slip_id;
        this.advice = advice;
    }

    public Integer getSlip_id() {
        return slip_id;
    }

    public void setSlip_id(Integer slip_id) {
        this.slip_id = slip_id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }
}
