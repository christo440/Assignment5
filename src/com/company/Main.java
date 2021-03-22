package com.company;

public class Main {

    public static void main(String[] args) {

        int [] arr = {2,4,6,8,10,14};

        sumOfArray(arr);
        averageofArray(arr);

    }

    public static void sumOfArray(int[] input) {
        int sum= 0;

        for(int i=0;i< input.length;i++){
            sum= sum + input[i];}

        System.out.println(sum);




    }

    public static void averageofArray(int[] inputs) {
        int avv = 0;
        int add= 0;
        for(int j=0;j< inputs.length;j++){
            add = add + inputs[j];
            avv= add/ inputs.length;}
        System.out.println(avv);

    }

}
// had problem of return and how to use the first sum method to get the average


