package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        Math math=new Math();
        Physics physics=new Physics();
        BasicComputer basicComputer=new BasicComputer();
        DiscreteMathematics discreteMathematics=new DiscreteMathematics();
        AdvanceComputer advanceComputer=new AdvanceComputer();
        while (true)
        {
            System.out.println("enter a subject:");
            String subject=scanner.nextLine();

            switch (subject){
                case "math":{
                    math.unit();
                    math.prerequisite();
                    math.together();
                }break;
                case "physics":{
                    physics.unit();
                    physics.prerequisite();
                    physics.together();
                }break;
                case "basic computer":{
                   basicComputer.unit();
                   basicComputer.prerequisite();
                   basicComputer.together();
                }break;
                case "discrete mathematics":{
                    discreteMathematics.unit();
                    discreteMathematics.prerequisite();
                    discreteMathematics.together();
                }break;
                case "advance computer":{
                    advanceComputer.unit();
                    advanceComputer.prerequisite();
                    advanceComputer.together();
                }break;
                default:
                    System.out.println("NO data.");
        }



    }
}}
