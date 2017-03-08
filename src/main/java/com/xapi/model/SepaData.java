package com.xapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SepaData {

    private String SCT;
    private String SDD;
    private String COR1;
    private String B2B;
    private String SCC;

    public SepaData() {
    }

    public SepaData(String SCT, String SDD, String COR1, String B2B, String SCC) {
        this.SCT = SCT;
        this.SDD = SDD;
        this.COR1 = COR1;
        this.B2B = B2B;
        this.SCC = SCC;
    }

    public String getSCT() {
        return SCT;
    }

    @JsonProperty("SCT")
    public void setSCT(String SCT) {
        this.SCT = SCT;
    }

    public String getSDD() {
        return SDD;
    }

    @JsonProperty("SDD")
    public void setSDD(String SDD) {
        this.SDD = SDD;
    }

    public String getCOR1() {
        return COR1;
    }

    @JsonProperty("COR1")
    public void setCOR1(String COR1) {
        this.COR1 = COR1;
    }

    public String getB2B() {
        return B2B;
    }

    @JsonProperty("B2B")
    public void setB2B(String b2B) {
        B2B = b2B;
    }

    public String getSCC() {
        return SCC;
    }

    @JsonProperty("SCC")
    public void setSCC(String SCC) {
        this.SCC = SCC;
    }
}
