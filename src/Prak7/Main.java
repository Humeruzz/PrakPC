package Prak7;

import java.util.Stack;

public class Main {
    public static void main(String [] args){
        Deck deck1 = new Deck(5);
        Deck deck2 = new Deck(5);
        deck1.showInfo();
        deck2.showInfo();
        int i = 0;
        while ((deck1.getNum() != 0)||(deck2.getNum()!=0)||(i == 106)){
            System.out.println("Deck 1: "+ deck1.isEmpty() + " Deck 2: " + deck2.isEmpty());
            System.out.println(i);
            if (deck1.isEmpty()) {
                deck1.swap();
                if (deck1.getNum() == 0){
                    deck1.showInfo();
                    deck1.showInfoDown();
                    break;
                }
            }
            if (deck2.isEmpty()){
                deck2.swap();
                if (deck2.getNum() == 0){
                    deck2.showInfo();
                    deck2.showInfoDown();
                    break;
                }
            }
            int k = deck1.topCard();
            int l = deck2.topCard();
            System.out.println("Card 1: "+k+" Card 2: " + l);
            if (k < l) {
                deck2.downCard(l, k);
            } else if (k > l){
                deck1.downCard(k,l);
            }
            else if (k == l){
                if ((deck1.getNum() == 0)||(deck2.getNum()==0)){
                    deck1.showInfo();
                    deck1.showInfoDown();
                    deck2.showInfo();
                    deck2.showInfoDown();
                    break;
                }
                if (deck1.isEmpty()){
                    deck1.swap();
                }
                if (deck2.isEmpty()){
                    deck2.swap();
                }
                int k2 = deck1.topCard();
                int l2 = deck2.topCard();
                if (k2 < l2){
                    deck2.downCard(l,l2,k,k2);
                } else {
                    deck1.downCard(k,k2,l,l2);
                }
            }
            i++;
            deck1.showInfo();
            deck1.showInfoDown();
            deck2.showInfo();
            deck2.showInfoDown();
        }
        if (deck1.getNum() == 0){
            System.out.println("Win second player with " + i + " turns");
        } else if (deck2.getNum() == 0){
            System.out.println("Win first player with " + i + " turns");
        } else if (i == 106) {
            System.out.println("No one wins. Botva!");
        }
    }
}
