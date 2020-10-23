package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    	try{
			List<String> boats = new ArrayList<String>();
			boats.add("Big Boat");
			boats.add("Small Boat");
			boats.add("Medium Boat");
			boats.add("Tiny Boat");
			boats.add("Ludicrously Large Boat");
			boats.add("Minuscule Boat");
			Collections.sort(boats);
			System.out.println(boats);
			String[] boaty = boats.toArray(new String[0]);
			for(int i = 0; i<boaty.length; i++){
				System.out.println(boaty[i]);
			}
			List<String> boatSubList = boats.subList(1,5);
			System.out.println(boatSubList);
			String theGOATBOAT = boatSubList.get(0);
			System.out.println(theGOATBOAT);
			boats.remove(theGOATBOAT);
			List<String> anotherBoat = new ArrayList<String>();
			Collections.copy(anotherBoat, boats);
			System.out.println(boats);
			System.out.println(anotherBoat);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
