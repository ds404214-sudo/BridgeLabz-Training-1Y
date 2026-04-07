package com.gla.Strings.level2;
import java.util.*;
public class RPS { static String[] choices = {"rock", "paper", "scissors"};

    static String compChoice() {
        return choices[(int)(Math.random() * 3)];
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 0; i < n; i++) {
            String user = sc.next();
            String comp = compChoice();

            int res = winner(user, comp);

            if (res == 1) userWin++;
            else if (res == -1) compWin++;
        }

        System.out.println("User wins: " + userWin);
        System.out.println("Computer wins: " + compWin);
    }
}
