package com.gla.methods.level3;
import java.util.*;
public class CalendarProgram { public static boolean isLeap(int year) {
    return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
}

    public static int getDays(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeap(year)) return 29;
        return days[month - 1];
    }

    public static String getMonthName(int month) {
        String[] names = {"Jan","Feb","Mar","Apr","May","Jun",
                "Jul","Aug","Sep","Oct","Nov","Dec"};
        return names[month - 1];
    }

    // Zeller’s Congruence
    public static int firstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }

        int k = year % 100;
        int j = year / 100;

        int h = (1 + (13*(month+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7; // convert to 0=Sun
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = firstDay(month, year);
        int days = getDays(month, year);

        for (int i = 0; i < start; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
    }
}
