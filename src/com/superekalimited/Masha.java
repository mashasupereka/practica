package com.superekalimited;

import java.util.Scanner;

/**
 * Created by Ilya Shishkarev on 11.01.2017.
 */
public class Masha {
    public static void main(String[] args) {

        int mounth = 4;
        String mounthString;
        switch (mounth) {
            case 1:
                mounthString = "Январь";
                break;
            case 2:
                mounthString = "Фефраль";
                break;
            case 3:
                mounthString = "Март";
                break;
            case 4:
                mounthString = "Апрель";
                break;
            case 5:
                mounthString = "Май";
                break;
            case 6:
                mounthString = "Июнь";
                break;
            default:
                mounthString = "Не знаем";

        }System.out.println(mounthString);


    }
}








