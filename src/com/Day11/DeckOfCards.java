package com.Day11;

public class DeckOfCards {

    static String[] suit = {"hearts", "spade", "Tree", "diamond"};
    static String[] rank = {"ace", "king", "queen", "jack", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] deq = new String[52];


    public static void main(String[] args) {
        /*creating four objects of players and ther array to store cards*/
        DeckOfCards player1 = new DeckOfCards();
        String[] p1 = new String[9];
        DeckOfCards player2 = new DeckOfCards();
        String[] p2 = new String[9];
        DeckOfCards player3 = new DeckOfCards();
        String[] p3 = new String[9];
        DeckOfCards player4 = new DeckOfCards();
        String[] p4 = new String[9];

        int k = 0;
        /*Initialize a deq*/
        for (String i : suit) {
            for (String j : rank) {
                deq[k] = i + j;
                k++;
            }
        }

        /*filling four arrays for four players using distrubute method*/
        player1.distribute(p1);
        player2.distribute(p2);
        player3.distribute(p3);
        player4.distribute(p4);
    }

    /*distribue the cards by assign any random card from deq*/
    void distribute(String[] arr) {
        for (int i = 0; i < 9; i++) {
            int r = (int) Math.floor((Math.random() * 10) % 13);
            arr[i] = deq[r];
            System.out.println(arr[i]);
        }
    }

}

