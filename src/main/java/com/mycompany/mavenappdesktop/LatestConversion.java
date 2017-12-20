/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenappdesktop;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RomyRivaldy
 */
public class LatestConversion {

    private String disclaimer;
    private String license;
    private long timestamp;
    private String base;
    private Map<String, Double> rates = new HashMap<String, Double>();

    public Date getLastDate() {
        return new Date(getTimestamp() * 1000);
    }
//    public Double getConvertion

    public LatestConversion() {
    }

    public LatestConversion(String disclaimer, String license, long timestamp, String base) {
        this.disclaimer = disclaimer;
        this.license = license;
        this.timestamp = timestamp;
        this.base = base;
    }
    
    public Double getConvertToUSD(String from, Double uang){
        Double res = 0.0;
        Double fromUang = rates.get(from);
        res = uang / fromUang;
        return res;
    }
    
    public Double getConvertionResult(String from, String ke, Double uang){
        Double res = 0.0;
        Double toUang = rates.get(ke);
        Double usdBase = getConvertToUSD(from, uang);
        res = usdBase * toUang;
        return res;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
