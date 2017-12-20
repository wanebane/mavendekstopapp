/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenappdesktop;

import org.springframework.web.client.RestTemplate;

/**
 *
 * @author RomyRivaldy
 */
public class ConversionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "https://openexchangerates.org/api/latest.json?app_id=9971e55b38854948a88c9d1cb6814cc6";
        RestTemplate restTemplate = new RestTemplate();
        LatestConversion latest = restTemplate.getForObject(url, LatestConversion.class);
        System.out.println("Base Currency : "+latest.getBase());
        System.out.println("$1 USD = "+latest.getRates().get("IDR"));
        System.out.println("Date : "+latest.getLastDate());
        
       
    }
}
