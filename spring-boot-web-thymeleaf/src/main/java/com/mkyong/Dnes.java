package com.mkyong;

import java.text.SimpleDateFormat;
import java.util.Calendar;

// @author pstepanek

public class Dnes {

    public static void main(String[] args) {
        // Dnes, obsahuje dnesni datum.
        String dnes = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        // Moznost kontroly vysledku: 
        //System.out.print(dnes);
    }
}