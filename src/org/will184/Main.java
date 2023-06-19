package org.will184;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha: "+fecha);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE dd 'de' MMMM,yyyy");
        String fechaStr = dateFormat.format(fecha);
        System.out.println("fechaStr: "+fechaStr);

    }
}