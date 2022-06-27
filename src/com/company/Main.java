package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i< arr.length;i++){
            System.out.print(temp[i]);
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==temp[j]){
                    System.out.print(j+1);
                }
            }
        }


    }
}
