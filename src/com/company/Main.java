
package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;


public class Main {

    public static void main(String[] args) {
	    //enter in birthdaaaay
        System.out.println("Enter in your birth year:");
        Scanner scan = new Scanner(System.in);
        int birthYear = scan.nextInt();

        System.out.println("Enter in the day you were born:");
        int birthDay = scan.nextInt();

        System.out.println("Enter in your birth month:");
        int birthMonth = scan.nextInt();

        //get current date
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int year = localDate.getYear();
        //System.out.println(month+" "+ day + " " + year);

        //subtract to find age
        int yearDif = year-birthYear;

        if((month-birthMonth)>0){
            System.out.println("you are " + yearDif + " years old");
        }

        else if((month-birthMonth)<0){
            System.out.println(("you are " + (yearDif-1) + " years old"));
        }

        else{
            if(day>=birthDay){
                System.out.println("you are " + yearDif + " years old");
            }
            else{
                System.out.println(("you are " + (yearDif-1) + " years old"));
            }
        }
    }
}
