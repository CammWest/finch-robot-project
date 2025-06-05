package com.srd;
import com.birdbrain.Finch;
public class DanceFinch {
    public static void main (String[] args) {
        Finch bird = new Finch();
        /*
         * For loop that goes through code
         * to do the dance 2 times
         */
        
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

            bird.setTurn("L", 780 , 90);
            bird.setBeak(100,100,100);
            bird.setTail("all", 100, 100, 100);

        /*
         * Nested For loop that goes through code to do 
         * the shimmy once then dance then shimmy again
         */        
            
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

    /*
    * Plays happy birthday at the end to finish off the dance
    */

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(57, 1);
    bird.pause(1.1);

    bird.playNote(55, 1);
    bird.pause(1.1);

    bird.playNote(60, 1);
    bird.pause(1.1);

    bird.playNote(59, 2);
    bird.pause(2.1);

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(57, 1);
    bird.pause(1.1);

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(62, 1);
    bird.pause(1.1);

    bird.playNote(60, 2);
    bird.pause(2.1);
    
    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(55, 0.5);
    bird.pause(0.6);

    bird.playNote(67, 1);
    bird.pause(1.1);

    bird.playNote(64, 1);
    bird.pause(1.1);

    bird.playNote(60, 1);
    bird.pause(1.1);

    bird.playNote(59, 1);
    bird.pause(1.1);

    bird.playNote(57, 1.5);
    bird.pause(1.6);

    bird.playNote(65, 0.5);
    bird.pause(0.6);

    bird.playNote(65, 0.5);
    bird.pause(0.6);

    bird.playNote(64, 1);
    bird.pause(1.1);

    bird.playNote(60, 1);
    bird.pause(1.1);

    bird.playNote(62, 1);
    bird.pause(1.1);

    bird.playNote(60, 3);
    bird.pause(3.1);

    bird.disconnect();
    }


}