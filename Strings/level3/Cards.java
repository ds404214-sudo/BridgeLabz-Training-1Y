package com.gla.Strings.level3;
import java.util.*;
public class Cards { static String[] createDeck() {
    String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    String[] deck = new String[52];
    int k = 0;

    for (String s : suits)
        for (String r : ranks)
            deck[k++] = r + " of " + s;

    return deck;
}

    static void shuffle(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    static void distribute(String[] deck, int players, int cards) {
        int k = 0;
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i+1));
            for (int j = 0; j < cards; j++) {
                System.out.println(deck[k++]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        shuffle(deck);
        distribute(deck, 4, 5);
    }
}
