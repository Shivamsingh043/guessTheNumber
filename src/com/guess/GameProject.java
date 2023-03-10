package com.guess;
import java.util.Random;
import java.util.Scanner;

class Game {
    public int randomNumber;
    public int enterInput;
    private int numberOfGuesses = 0;
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public void setNumberOfGuesses(int numberOfGuesses) {
        this.numberOfGuesses = numberOfGuesses;
    }
    Game() {
        Random random = new Random();
        this.randomNumber = random.nextInt(100);
    }
    public void takeUserInput() {
        System.out.println("please enter a number: ");
        Scanner sc = new Scanner(System.in);
        enterInput = sc.nextInt();

    }
    public boolean isCorrectNumber(int num) {
        numberOfGuesses++;
        if (num == randomNumber) {
            System.out.format("yes you guess it right, it was %d and you guess it in %d attempts", + randomNumber, numberOfGuesses);
            return true;
        } else if (num < randomNumber) {
            System.out.println("guess is too low!");
        } else if (num > randomNumber) {
            System.out.println("guess is too high!");
        }
        return false;
    }
}
public class GameProject {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber(g.enterInput);
        }

    }
}
