package com.xapi.model;


public class BankData {

    private String bic;
    private String branch;
    private String bank;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String fax;
    private String www;
    private String email;
    private String country;
    private String country_iso;
    private String account;

    public BankData() {
    }

    public BankData(String bic, String branch, String bank, String address, String city, String state, String zip, String phone, String fax, String www, String email, String country, String country_iso, String account) {
        this.bic = bic;
        this.branch = branch;
        this.bank = bank;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.fax = fax;
        this.www = www;
        this.email = email;
        this.country = country;
        this.country_iso = country_iso;
        this.account = account;
    }

    public String getBic() {
        return bic;
    }

    public String getBranch() {
        return branch;
    }

    public String getBank() {
        return bank;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWww() {
        return www;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getCountry_iso() {
        return country_iso;
    }

    public String getAccount() {
        return account;
    }
}
