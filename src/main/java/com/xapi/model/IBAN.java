package com.xapi.model;

import java.util.ArrayList;

public class IBAN {
    private BankData bank_data;
    private ArrayList errors;
    private ArrayList<Validation> validations;
    private SepaData sepa_data;

    public IBAN() {
    }

    public IBAN(BankData bank_data, ArrayList errors, ArrayList<Validation> validations, SepaData sepa_data) {
        this.bank_data = bank_data;
        this.errors = errors;
        this.validations = validations;
        this.sepa_data = sepa_data;
    }

    public BankData getBank_data() {
        return bank_data;
    }

    public void setBank_data(BankData bank_data) {
        this.bank_data = bank_data;
    }

    public ArrayList getErrors() {
        return errors;
    }

    public void setErrors(ArrayList errors) {
        this.errors = errors;
    }

    public ArrayList<Validation> getValidations() {
        return validations;
    }

    public void setValidations(ArrayList<Validation> validations) {
        this.validations = validations;
    }

    public SepaData getSepa_data() {
        return sepa_data;
    }

    public void setSepa_data(SepaData sepa_data) {
        this.sepa_data = sepa_data;
    }
}
