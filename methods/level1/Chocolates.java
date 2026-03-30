package com.gla.methods.level1;
import java.util.Scanner;
public class Chocolates { public static int[] findRemainderAndQuotient(int chocolates, int children) {
    return new int[]{chocolates / children, chocolates % children};
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter chocolates and children: ");
        int choco = sc.nextInt();
        int kids = sc.nextInt();

        int[] result = findRemainderAndQuotient(choco, kids);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
