package Prak7;

import java.io.IOException;
import java.util.Stack;

public class Deck {
    private int num;
    private Stack<Integer> deck = new Stack<>();
    private Stack<Integer> downdeck = new Stack<>();

    public Deck(int num) {
        this.num = num;
        for (int i = 0; i < this.num; i++) {
            this.deck.push((int)(Math.random()*9)+1);
        }
    }

    public int topCard(){
        this.num--;
        return this.deck.pop();
    }

    public int getNum(){
        return this.num;
    }

    public boolean isEmpty(){
        return this.deck.empty();
    }

    public void swap(){
        while (!this.downdeck.empty()){
            int temp = this.downdeck.pop();
            this.deck.push(temp);
        }
    }

    public void showInfo(){
        Stack<Integer> tempS = new Stack<>();
        System.out.print("Your deck is: [");
        while (!this.deck.isEmpty()){
            int tempI = this.deck.pop();
            System.out.print(tempI + ", ");
            tempS.push(tempI);
        }
        System.out.print("]\n");
        while (!tempS.empty()){
            int tempI = tempS.pop();
            this.deck.push(tempI);
        }
    }

    public void showInfoDown(){
        Stack<Integer> tempS = new Stack<>();
        System.out.print("Your deck is: [");
        while (!this.downdeck.isEmpty()){
            int tempI = this.downdeck.pop();
            System.out.print(tempI + ", ");
            tempS.push(tempI);
        }
        System.out.print("]\n");
        while (!tempS.empty()){
            int tempI = tempS.pop();
            this.downdeck.push(tempI);
        }
    }

    public void downCard(int ucard, int ocard){
        this.downdeck.push(ucard);
        this.num++;
        this.downdeck.push(ocard);
        this.num++;
    }

    public void downCard(int ucard1,int ucard2,int ocard1,int ocard2){
        this.downdeck.push(ucard1);
        this.num++;
        this.downdeck.push(ucard2);
        this.num++;
        this.downdeck.push(ocard1);
        this.num++;
        this.downdeck.push(ocard2);
        this.num++;
    }

    public String output() {
        String str = "Deck:\nnum= " + this.num + "\ndeck= ";
        for (int i = 0 ; i < this.num; i++){
            str = str + this.deck.pop() + " ";
        }
        return str;
    }

    @Override
    public String toString() {
        return "Deck{" +
                "num=" + num +
                ", deck=" + deck +
                '}';
    }
}
