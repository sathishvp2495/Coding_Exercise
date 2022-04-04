package com.test.searching;

public class LinearSearch {

    static int searchNumber(int arr[] , int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};

        int x = 110;

        int searchIndex = searchNumber(arr,x);

        if(searchIndex >= 0){
            System.out.println("value present in index : "+searchIndex);
        }else{
            System.out.println("value not present");
        }
    }
}
