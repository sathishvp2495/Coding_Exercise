package com.test.searching;

public class BinarySearch {

    static int searchIndex(int arr[],int snum,int left,int right){
        if(left<=right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == snum)
                return mid;

            if(arr[mid] > snum){
                return searchIndex(arr,snum,left,mid-1);
            }else{
                return searchIndex(arr,snum,mid+1,right);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,80,90,95};
        int key = 95;
        int result = searchIndex(arr,key,0,arr.length);
        if (result == -1)
            System.out.println("Number not found");
        else
            System.out.println("Number found at index : "+result);
    }
}

