package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Prompter access= new Prompter();

        access.greetUser();
        do
        {
            access.prompt();
            access.processPrompt();
        }

        while(!access.isFinishedBanking);


    }
}
