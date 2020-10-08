package com.endurance.apac.referral.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Transaction {

    private UUID uuid;
    private String code;
    private String invoiceID;
    private String referrer;
    private String referee;

    public Transaction(@JsonProperty("code") String code,
                       @JsonProperty("invoiceID") String invoiceID,
                       @JsonProperty("referrer") String referrer,
                       @JsonProperty("referee") String referee) {
        this.uuid = UUID.randomUUID();
        this.code = code;
        this.invoiceID = invoiceID;
        this.referrer = referrer;
        this.referee = referee;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }
}
