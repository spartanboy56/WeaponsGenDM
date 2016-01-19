package com.company;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Pappy on 1/13/2016.
 */
public class Construct {




    public static int randomHiltGenID() {

        Random numGen = new Random();

        int randInt = numGen.nextInt(4) + 1;

        return randInt;
    }


    public static int randomBladeGenID(){
        Random numGen = new Random();

        int randInt = numGen.nextInt(4)  + 1;

        return randInt;
    }

    public static int randomBuffGenID(){


        Random numGen = new Random();

        int randInt = numGen.nextInt(4)  + 1;

        return randInt;
    }

    public static int randomWeaponChoice(){


        Random numGen = new Random();

        int randInt = numGen.nextInt(2)  + 1;

        return randInt;
    }

    private static SecureRandom random = new SecureRandom();

    public static String nextId() {
        return new BigInteger(130, random).toString(32);
    }





}