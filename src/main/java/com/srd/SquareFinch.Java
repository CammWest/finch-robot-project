package com.srd;
import com.birdbrain.Finch;
public class SquareFinch {
    public static void main (String[] args) {
        Finch bird = new Finch();
        //for loop for the dance
        for(int i = 0; i < 2; i++) {
        bird.playNote(60, 1);
        bird.setBeak(100,0,0);
        bird.setTail("all", 100, 0, 0);


        bird.setMove("F", 10, 100);
        bird.setBeak(0,100,0);
        bird.setTail("all", 0, 100, 0);

        bird.setTurn("L", 40 , 100);
        bird.setBeak(0,0,100);
        bird.setTail("all", 0, 0, 100);

        bird.setMove("B", 10, 100);
        bird.setBeak(100,0,0);
        bird.setTail("all", 100, 0, 0);

        bird.setTurn("L", 40 , 100);
        bird.setBeak(0,100,0);
        bird.setTail("all", 0, 100, 0);

        bird.setMove("F", 10, 100);
        bird.setBeak(0,0,100);
        bird.setTail("all", 0, 0, 100);

        bird.setTurn("L", 840 , 100);
        bird.setBeak(100,100,100);
        bird.setTail("all", 100, 100, 100);

        //for loop for the shimmy
        for(int k = 0; k < 1; k++) {
            bird.stopAll();
            bird.setBeak(100,100,100);
            
            bird.setTail(1, 100, 0, 0);
            bird.setTurn("R", 40 , 100);

            bird.setTail(2, 0, 0, 100);
            bird.setTurn("L", 40 , 100); 

            bird.setTail(3, 100, 0, 0);
            bird.setTurn("R", 40 , 100);

            bird.setTail(4, 0, 0, 100);
            bird.setTurn("L", 40 , 100);

            bird.setTail(1, 0, 0, 0);
            bird.setTurn("R", 40 , 100);

            bird.setTail(2, 0, 0, 0);
            bird.setTurn("L", 40 , 100);

            bird.setTail(3, 0, 0, 0);
            bird.setTurn("R", 40 , 100);

            bird.setTail(4, 0, 0, 0);
            bird.setTurn("L", 40 , 100);
        }
    }

        bird.playNote(60, 0.5);

        bird.stopAll();
    }


}