package com.panya;

import AnimalPackage.Lioness;
import ExceptionPackage.LionessCubOverloadException;
import ExceptionPackage.SpidermanSuitNonExistentException;
import SuperheroPackage.Spiderman;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        try{

            Lioness alphaLioness = new Lioness(
                    "alpha lioness",
                    "carnivore",
                    true,
                    "female",
                    "europe",
                    true,
                    9
            );
            Lioness betaLioness = new Lioness(

                    "beta lioness",
                    "herbivore",
                    false,
                    "female",
                    "middle east",
                    true,
                    10

            );
            Spiderman milesMorales = new Spiderman(
                    "miles morales",
                    "Spiderman",
                    "Marvel",
                    Optional.of("Spider"),
                    "male",
                    true,
                    "black");


            Spiderman peterParker = new Spiderman(

                    "peter parker",
                    "Spiderman",
                    "Marvel",
                    Optional.of("Spider"),
                    "male",
                    true,
                    "red");

            List<IFlyable> flyables = new ArrayList<>();
            flyables.add(milesMorales);
            flyables.add(peterParker);
            flyables.add(alphaLioness);
            flyables.add(betaLioness);

            milesMorales.getPower().ifPresent(System.out::println);

        }catch(LionessCubOverloadException | SpidermanSuitNonExistentException e){
            System.out.println(e);
        } finally{
            System.out.println("WORKS");
        }

    }
}