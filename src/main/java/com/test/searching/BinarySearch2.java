package com.test.searching;

public class BinarySearch2 {
    static int numberSearch(int arr[], int sNum) {

        int left = 0, right = arr.length;

        while (left <= right) {


            int mid = left + (right - left) / 2;
            if (arr[mid] == sNum)
                return mid;

            if (arr[mid] > sNum) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int indexValue = numberSearch(arr,60);

        if(indexValue == -1){
            System.out.println("Number not found!");
        }else{
            System.out.println("Number found at index : "+indexValue);
        }
    }
}
