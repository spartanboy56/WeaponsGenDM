package com.company;





/**
 * Created by Pappy on 1/13/2016.
 */
public class weapons {

    String WeaponID;

    String weapType;
    String hilt;
    String blade;
    String buff;
    int damage;
    int speed;
    int buffEffect;
    String name = hilt + " " + blade + " " + weapType;

    @Override
    public String toString(){
        return name;}


    public weapons(String Hilt, String Blade, String Buff, int Speed, int Damage, int BuffEffect, String WeapID,String Weaptype ){

        weapType = Weaptype;
        WeaponID = WeapID;
        hilt = Hilt;
        blade = Blade;
        buff = Buff;
        speed = Speed;
        damage = Damage;
        buffEffect = BuffEffect;
        name = hilt + " " + blade + " " + weapType;


    }



}