package org.example;


import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
    public static void main( String[] args ){
Auto auto=new Auto();
ArrayList<Auto> autos=auto.getallAutos();
        HashMap<Integer, Auto> hashMapAutos=new HashMap<>();
        for(Auto a: autos){
            hashMapAutos.put(a.getId(),a);
            
        }
        System.out.println(hashMapAutos);
    }
}
