package com.company;



import javax.swing.*;
import java.util.*;


/*
Author: Chris Pappas



 */
public class Main {



    public static void main(String[] args) {



        Map HiltpartsStrength = new HashMap();
        Map HiltID = new HashMap();
        Map DaggerBladepartsStrength = new HashMap();
        Map DaggerBladeID = new HashMap();
        Map DaggerBuffEffect = new HashMap();
        Map DaggerBuffID = new HashMap();
        Map SwordBladepartsStrength = new HashMap();
        Map SwordBladeID = new HashMap();
        Map SwordBuffEffect = new HashMap();
        Map SwordBuffID = new HashMap();




        // Map InventoryMap = new HashMap();
        ArrayList Inv1 = new ArrayList();
        ArrayList Inv2 = new ArrayList();
        ArrayList Inv3 = new ArrayList();
        ArrayList Inv4 = new ArrayList();
        ArrayList Inv5 = new ArrayList();

        String[] InvName1 = new String[6];
        InvName1[5] = "Do not inspect";

//Maps for parts. ID-maps allows a random number generator to pick a part type. Strength/effect-maps give you the stats of the part.
        HiltpartsStrength.put("Slow", 2);
        HiltpartsStrength.put("Crawling", 1);
        HiltpartsStrength.put("Normal", 3);
        HiltpartsStrength.put("Quick", 4);
        HiltpartsStrength.put("Fast", 5);


        HiltID.put(1, "Crawling");
        HiltID.put(2, "Slow");
        HiltID.put(3, "Normal");
        HiltID.put(4, "Quick");
        HiltID.put(5, "Fast");

        DaggerBladepartsStrength.put("Very sharp", 5);
        DaggerBladepartsStrength.put("Sharp", 4);
        DaggerBladepartsStrength.put("Prickly", 3);
        DaggerBladepartsStrength.put("Dull", 2);
        DaggerBladepartsStrength.put("Blunt", 1);

        DaggerBladeID.put(5,"Very sharp");
        DaggerBladeID.put(4,"Sharp");
        DaggerBladeID.put(3,"Prickly");
        DaggerBladeID.put(2,"Dull");
        DaggerBladeID.put(1,"Blunt");

        DaggerBuffEffect.put("Dex + 5", 5);
        DaggerBuffEffect.put("Dex + 4", 4);
        DaggerBuffEffect.put("Dex + 3", 3);
        DaggerBuffEffect.put("Dex + 2", 2);
        DaggerBuffEffect.put("Dex + 1", 1);

        DaggerBuffID.put(5,"Dex + 5");
        DaggerBuffID.put(4,"Dex + 4");
        DaggerBuffID.put(3,"Dex + 3");
        DaggerBuffID.put(2,"Dex + 2");
        DaggerBuffID.put(1,"Dex + 1");

        SwordBladepartsStrength.put("Very sharp", 5);
        SwordBladepartsStrength.put("Sharp", 4);
        SwordBladepartsStrength.put("Prickly", 3);
        SwordBladepartsStrength.put("Dull", 2);
        SwordBladepartsStrength.put("Blunt", 1);

        SwordBladeID.put(5,"Very sharp");
        SwordBladeID.put(4,"Sharp");
        SwordBladeID.put(3,"Fine");
        SwordBladeID.put(2,"Dull");
        SwordBladeID.put(1,"Blunt");

        SwordBuffEffect.put("Damage + 5", 5);
        SwordBuffEffect.put("Damage + 4", 4);
        SwordBuffEffect.put("Damage + 3", 3);
        SwordBuffEffect.put("Damage + 2", 2);
        SwordBuffEffect.put("Damage + 1", 1);

        SwordBuffID.put(5,"Damage + 5");
        SwordBuffID.put(4,"Damage + 4");
        SwordBuffID.put(3,"Damage + 3");
        SwordBuffID.put(2,"Damage + 2");
        SwordBuffID.put(1,"Damage + 1");



        //Keeps track of the parts for the weapon currently being made.
        int CurhiltID, CurbladeID, CurbuffID;
        int cont = 0;
        String Dagger = "Dagger";
        String Sword = "Sword";

        while(cont == 0) {
            int chestOpen = JOptionPane.showConfirmDialog(null,
                    "Open the chest?",
                    "Weapon gen ver 0.00001",
                    JOptionPane.YES_OPTION);

            if (chestOpen == 0) {

                /*
                Randomly chooses between generating a sword or a dagger
                 */
                int WeapChoice = Construct.randomWeaponChoice();

                System.out.println(WeapChoice);

                if (WeapChoice == 1){

                    System.out.println("Opening!");

                    CurhiltID = Construct.randomHiltGenID();

                    String Curhilt = (String) HiltID.get(CurhiltID);

                    CurbladeID = Construct.randomBladeGenID();

                    String Curblade = (String) DaggerBladeID.get(CurbladeID);

                    CurbuffID = Construct.randomBuffGenID();

                    String Curbuff = (String) DaggerBuffID.get(CurbuffID);

                    JOptionPane.showMessageDialog(null,
                            "You received a " + Curhilt + " " + Curblade +  " " + Dagger,
                            "Weapon gen ver 0.00001",
                            JOptionPane.WARNING_MESSAGE);

                    String newID = Construct.nextId();

                    //Gets the stats for the given part in integer form
                    int CurhiltStrength = (Integer)HiltpartsStrength.get(Curhilt);
                    int CurbladeStrength = (Integer)DaggerBladepartsStrength.get(Curblade);
                    int CurbuffStrength = (Integer)DaggerBuffEffect.get(Curbuff);

                    // creates the new weapon
                    Daggertemp newDagger = new Daggertemp(Curhilt,Curblade,Curbuff,CurhiltStrength,CurbladeStrength,CurbuffStrength,newID, Dagger);

                    String WeapStrang = newDagger.name.toString();

                    //Puts the new weapon in the inventory slot
                    if(Inv1.size() < 1){
                        Inv1.add(newDagger.name);
                        Inv1.add(newDagger.damage);
                        Inv1.add(newDagger.speed);
                        Inv1.add(newDagger.buff);
                    }
                    else if(Inv2.size() < 1){
                        Inv2.add(newDagger.name);
                        Inv2.add(newDagger.damage);
                        Inv2.add(newDagger.speed);
                        Inv2.add(newDagger.buff);
                    }
                    else if(Inv3.size() < 1){
                        Inv3.add(newDagger.name);
                        Inv3.add(newDagger.damage);
                        Inv3.add(newDagger.speed);
                        Inv3.add(newDagger.buff);
                    }
                    else if(Inv4.size() < 1){
                        Inv4.add(newDagger.name);
                        Inv4.add(newDagger.damage);
                        Inv4.add(newDagger.speed);
                        Inv4.add(newDagger.buff);
                    }
                    else if(Inv5.size()< 1){
                        Inv5.add(newDagger.name);
                        Inv5.add(newDagger.damage);
                        Inv5.add(newDagger.speed);
                        Inv5.add(newDagger.buff);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Your inventory is full! You can no longer fit equipment into your pack."
                                ,"Weapon gen ver 0.00001",
                                JOptionPane.WARNING_MESSAGE);}

                    //Adds the weapons name to a String Array
                    if(InvName1[0] == null){
                        InvName1[0] = WeapStrang;
                    }
                    else if(InvName1[1].equals("Empty")){
                        InvName1[1] = WeapStrang;
                    }
                    else if(InvName1[2].equals("Empty")){
                        InvName1[2] = WeapStrang;
                    }
                    else if(InvName1[3].equals("Empty")){
                        InvName1[3] = WeapStrang;
                    }
                    else if(InvName1[4].equals("Empty")){
                        InvName1[4] = WeapStrang;
                    }

                    if (InvName1[0] == null) {
                        InvName1[0] = "Empty";
                        InvName1[1] = "Empty";
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[1] == null) {
                        InvName1[1] = "Empty";
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[2] == null) {
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[3] == null) {
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[4] == null) {
                        InvName1[4] = "Empty";

                    }
                    int Inspect = JOptionPane.showConfirmDialog(null,
                            "Would you like to inspect your new weapon?",
                            "Weapon gen ver 0.00001",
                            JOptionPane.YES_OPTION);

                    if(Inspect == 0){

                        JOptionPane.showMessageDialog(null,
                                "You have a " + newDagger.name + ". It has a speed stat of " + newDagger.speed +
                                        ", a damage stat of " + newDagger.damage + ", and a buff of " + newDagger.buff,
                                "Weapon gen ver 0.00001",
                                JOptionPane.WARNING_MESSAGE);
                    }}
                else if(WeapChoice == 2){
                    System.out.println("Opening!");

                    CurhiltID = Construct.randomHiltGenID();

                    String Curhilt = (String) HiltID.get(CurhiltID);

                    CurbladeID = Construct.randomBladeGenID();

                    String Curblade = (String) SwordBladeID.get(CurbladeID);

                    CurbuffID = Construct.randomBuffGenID();

                    String Curbuff = (String) SwordBuffID.get(CurbuffID);

                    JOptionPane.showMessageDialog(null,
                            "You received a " + Curhilt + " " + Curblade +  " " + Sword,
                            "Weapon gen ver 0.00001",
                            JOptionPane.WARNING_MESSAGE);

                    String newID = Construct.nextId();

                    //Gets the stats for the given part in integer form
                    int CurhiltStrength = (Integer)HiltpartsStrength.get(Curhilt);
                    int CurbladeStrength = (Integer)SwordBladepartsStrength.get(Curblade);
                    int CurbuffStrength = (Integer)SwordBuffEffect.get(Curbuff);

                    // creates the new weapon
                    Swordtemp newSword = new Swordtemp(Curhilt,Curblade,Curbuff,CurhiltStrength,CurbladeStrength,CurbuffStrength,newID, Sword);

                    String WeapString = newSword.name.toString();

                    //Puts the new weapon in the inventory slot
                    if(Inv1.size() < 1){
                        Inv1.add(newSword.name);
                        Inv1.add(newSword.damage);
                        Inv1.add(newSword.speed);
                        Inv1.add(newSword.buff);
                    }
                    else if(Inv2.size() < 1){
                        Inv2.add(newSword.name);
                        Inv2.add(newSword.damage);
                        Inv2.add(newSword.speed);
                        Inv2.add(newSword.buff);
                    }
                    else if(Inv3.size() < 1){
                        Inv3.add(newSword.name);
                        Inv3.add(newSword.damage);
                        Inv3.add(newSword.speed);
                        Inv3.add(newSword.buff);
                    }
                    else if(Inv4.size() < 1){
                        Inv4.add(newSword.name);
                        Inv4.add(newSword.damage);
                        Inv4.add(newSword.speed);
                        Inv4.add(newSword.buff);
                    }
                    else if(Inv5.size()< 1){
                        Inv5.add(newSword.name);
                        Inv5.add(newSword.damage);
                        Inv5.add(newSword.speed);
                        Inv5.add(newSword.buff);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Your inventory is full! You can no longer fit equipment into your pack."
                                ,"Weapon gen ver 0.00001",
                                JOptionPane.WARNING_MESSAGE);}

                    //Adds the weapons name to a String Array
                    if(InvName1[0] == null){
                        InvName1[0] = WeapString;
                    }
                    else if(InvName1[1].equals("Empty")){
                        InvName1[1] = WeapString;
                    }
                    else if(InvName1[2].equals("Empty")){
                        InvName1[2] = WeapString;
                    }
                    else if(InvName1[3].equals("Empty")){
                        InvName1[3] = WeapString;
                    }
                    else if(InvName1[4].equals("Empty")){
                        InvName1[4] = WeapString;
                    }

                    if (InvName1[0] == null) {
                        InvName1[0] = "Empty";
                        InvName1[1] = "Empty";
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[1] == null) {
                        InvName1[1] = "Empty";
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[2] == null) {
                        InvName1[2] = "Empty";
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[3] == null) {
                        InvName1[3] = "Empty";
                        InvName1[4] = "Empty";
                    } else if (InvName1[4] == null) {
                        InvName1[4] = "Empty";

                    }

                    //Allows to to inspect the new weapon
                    int Inspect = JOptionPane.showConfirmDialog(null,
                            "Would you like to inspect your new weapon?",
                            "Weapon gen ver 0.00001",
                            JOptionPane.YES_OPTION);

                    if(Inspect == 0){

                        JOptionPane.showMessageDialog(null,
                                "You have a " + newSword.name + ". It has a speed stat of " + newSword.speed +
                                        ", a damage stat of " + newSword.damage + ", and a buff of " + newSword.buff,
                                "Weapon gen ver 0.00001",
                                JOptionPane.WARNING_MESSAGE);

                    }}
            }else if (chestOpen == 1) {
                System.out.println("Goodbye!");

                System.exit(0);
            }


            int CheckInv = JOptionPane.showConfirmDialog(null,
                    "Would you like to see your inventory contents?",
                    "Weapon gen ver 0.00001",
                    JOptionPane.YES_OPTION);

            if(CheckInv == 0) {


                //Gives the ability to inspect one of the 5 items in your inventory

                int  InvCho = JOptionPane.showOptionDialog(null, "Click on a weapon to inspect it", "Weapons Gen. Ver. 0.00001",
                        JOptionPane.WARNING_MESSAGE, 0 , null, InvName1, InvName1[4]);

                while(InvCho != 5){

                    switch(InvCho){
                        case 0:
                            JOptionPane.showMessageDialog(null,
                                    "You weapon is a " +  InvName1[0] + ". with a damage stat of " + Inv1.get(1) + ", a speed stat of " + Inv1.get(2) + ", and a buff of " + Inv1.get(3),
                                    "Weapon gen ver 0.00001",
                                    JOptionPane.WARNING_MESSAGE);

                            InvCho = JOptionPane.showOptionDialog(null, "Please choose a weapon to inspect", "Weapons Gen. Ver. 0.00001",
                                    JOptionPane.WARNING_MESSAGE, 0 , null, InvName1, InvName1[5]);
                            break;

                        case 1:
                            if(Inv2.size() > 1){
                                JOptionPane.showMessageDialog(null,
                                        "You weapon is a " +  InvName1[1] + ". with a damage stat of " + Inv2.get(1) + ", a speed stat of " + Inv2.get(2) + ", and a buff of " + Inv2.get(3) ,
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);



                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "There is no weapon in that slot!",
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }


                            InvCho = JOptionPane.showOptionDialog(null, "Please choose a weapon to inspect", "Weapons Gen. Ver. 0.00001",
                                    JOptionPane.WARNING_MESSAGE, 0 , null, InvName1, InvName1[4]);
                            break;

                        case 2:
                            if(Inv3.size() > 1){
                                JOptionPane.showMessageDialog(null,
                                        "You weapon is a " +  InvName1[2] + ". with a damage stat of " + Inv3.get(1) + ", a speed stat of " + Inv3.get(2) + ", and a buff of " + Inv3.get(3),
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "There is no weapon in that slot!",
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }


                            InvCho = JOptionPane.showOptionDialog(null, "Please choose a weapon to inspect", "Weapons Gen. Ver. 0.00001",
                                    JOptionPane.WARNING_MESSAGE, 0 , null, InvName1, InvName1[4]);
                            break;

                        case 3:

                            if(Inv4.size() > 1){
                                JOptionPane.showMessageDialog(null,
                                        "You weapon is a " +  InvName1[3] + ". with a damage stat of " + Inv4.get(1) + ", a speed stat of " + Inv4.get(2) + ", and a buff of " + Inv4.get(3),
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "There is no weapon in that slot!",
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }


                            InvCho = JOptionPane.showOptionDialog(null, "Please choose a weapon to inspect", "Weapons Gen. Ver. 0.00001",
                                    JOptionPane.WARNING_MESSAGE, 0 , null, InvName1, InvName1[4]);
                            break;

                        case 4:
                            if(Inv5.size() > 1){
                                JOptionPane.showMessageDialog(null,
                                        "You weapon is a " +  InvName1[4] + ". with a damage stat of " + Inv5.get(1) + ", a speed stat of " + Inv5.get(2) + ", and a buff of " + Inv5.get(3),
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "There is no weapon in that slot!",
                                        "Weapon gen ver 0.00001",
                                        JOptionPane.WARNING_MESSAGE);
                            }



                            InvCho = JOptionPane.showOptionDialog(null, "Please choose a weapon to inspect", "Weapons Gen. Ver. 0.00001",
                                    JOptionPane.WARNING_MESSAGE, 0 , null,InvName1, InvName1[4]);
                            break;
                    }}



                cont = JOptionPane.showConfirmDialog(null,
                        "Would you like to open another chest?",
                        "Weapon gen ver 0.00001",
                        JOptionPane.YES_OPTION);

                if(cont == 1){
                    System.exit(0);
                }

            }


        }

    }
}