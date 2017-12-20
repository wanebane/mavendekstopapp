/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenappdesktop;

import com.mycompany.model.CurrencyList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author RomyRivaldy
 */
public class CurrencyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "https://openexchangerates.org/api/currencies.json";
        RestTemplate restTemplate = new RestTemplate(); //restTemplate bawaan dari spring framework
//        List<Currency> currencyList = new ArrayList<>();
        Map<String, String> curriencies = restTemplate.getForObject(url, Map.class);
        for (Map.Entry<String, String> entry : curriencies.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ": "+value);
//            CurrencyList cur = new CurrencyList(key, (String) value);
//            currencyList.add(cur);
        }
//        System.out.println("Jumlah mata uang dunia : "+currencyList.size());
    }
    
}
