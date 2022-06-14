package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

import java.util.Arrays;

public class PhoneController {
    private String[] result = new String[2];

    public String[] method(){
        GalaxyNote9 galaxyNote9 = new GalaxyNote9();
        V40 v40 = new V40();

        Phone[] phones = new Phone[2];
        phones[0] = galaxyNote9;
        phones[1] = v40;

        for (int i = 0; i< result.length; i++) {
            if(phones[i]instanceof GalaxyNote9) {
               GalaxyNote9 galaxyNote91 = (GalaxyNote9)phones[i];
              result[i] = galaxyNote91.printlnformation();
            }
            else if(phones[i]instanceof V40) {
                V40 v401 = (V40)phones[i];
                result[i] = v401.printlnformation();
            }
        }

        return result;
    }


}
