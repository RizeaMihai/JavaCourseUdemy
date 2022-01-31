package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main (String[] args) {
        int [ ] array = getIntegers(3);
        printArray(array);
        System.out.println();
        printArray(sortDescending(array));
        System.out.println("Suma elementelor pare din matricea " + Arrays.toString(array) + " este: " + sumaElemPare(array));


    }

    public static int [] getIntegers (int dimensiune) {
        System.out.println("Introduceti " + dimensiune + " numere intregi:");
        Scanner scanner = new Scanner (System.in);
        int [] valori = new int[dimensiune];
        for (int i=0; i < dimensiune; i++){
            valori[i] = scanner.nextInt();
        }
        return valori;
    }

    public static void printArray (int[] dePrintat) {
        for (int i=0; i < dePrintat.length; i++) {
            System.out.println("Elementul de la index " + i + " este " + dePrintat[i]);
        }
    }

    public static int[] sortDescending (int[] deSortat){

        int[] sortata = Arrays.copyOf(deSortat, deSortat.length);
        boolean flag = true;
        int elementTemporar;
        while(flag){
            flag = false;
            for (int i=0; i < sortata.length - 1; i++){
                if (sortata[i] < sortata[i+1]){
                    System.out.println("PAS I ---> i = " + sortata[i]  + " i+1 = " + sortata[i+1]);
                    elementTemporar = sortata[i+1];
                    System.out.println("PAS II ---> i =  " + sortata[i] + ", element teporar = " + elementTemporar + " i+1 = " + sortata[i+1]);
                    sortata[i+1] = sortata[i];
                    System.out.println("PAS III ---> i =  " + sortata[i] + ", element teporar = " + elementTemporar + " i+1 = " + sortata[i+1]);
                    sortata[i] = elementTemporar;
                    System.out.println("PAS IV ---> i =  " + sortata[i] + ", element teporar = " + elementTemporar + " i+1 = " + sortata[i+1]);
                    flag = true;
                    System.out.println("PAS V ---> i =  " + sortata[i] + ", element teporar = " + elementTemporar + " i+1 = " + sortata[i+1]);
                }
            }
        }
        return sortata;
    }

    public static int sumaElemPare (int[] matrice) {
        int sum = 0;
        for (int i=0; i < matrice.length; i++){
            if(matrice[i] % 2 == 0){
                sum += matrice[i];
            }
        }
        return sum;
    }


}
