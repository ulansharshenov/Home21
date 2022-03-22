package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("ENTER WEEK: ");
        Scanner sc = new Scanner(System.in);
        Week week = Week.valueOf(sc.nextLine().toUpperCase());

        switch (week){
            case MONDAY: System.out.print(Week.MONDAY.getName() + " куну" + " Java lesson"); break;
            case TUESDAY: System.out.println(Week.TUESDAY.getName() + " куну" + " Session"); break;
            case WEDNESDAY: System.out.println(Week.WEDNESDAY.getName() + " куну" + " Java lesson"); break;
            case THURSDAY: System.out.println(Week.THURSDAY.getName() + " куну" + " Session"); break;
            case FRIDAY: System.out.println(Week.FRIDAY.getName() + " куну" + " Java lesson"); break;
            case SATURDAY: System.out.println(Week.SATURDAY.getName() + " куну" + " Holiday"); break;
            case SUNDAY: System.out.println(Week.SUNDAY.getName() + " куну" + " Holiday"); break;
        }
    }
}
