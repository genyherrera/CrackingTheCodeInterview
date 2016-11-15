package com.genyherrera.crackingthecodeinterview.interviewquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class IceCream implements Comparable<IceCream> {
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
      this.flavor = flavor;
      this.index = index;
    }
   
    @Override
    public int compareTo(IceCream o) {
       return Integer.compare(this.index, o.index);
    }

    public boolean equals(IceCream o){
       return this.index == o.index;
    }
        
}

public class IceCreamParlor {
   
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        return binarySearchRecursive(arr, search, first, last);
        
    }
    
    private static int binarySearchRecursive(IceCream[] arr, int search, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid].flavor < search) {
            return binarySearchRecursive(arr, search, mid+ 1, high);
        } else if (arr[mid].flavor > search) {
            return binarySearchRecursive(arr, search, low, mid - 1);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        
        int t;
        int n, m;
 
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
       for(int test = 0; test < t; test++) {       
            
            m = in.nextInt();
            n = in.nextInt(); 
            IceCream[] arr = new IceCream[n];
    
            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);
            
            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            } 
            
        }
        
    }
                        
}
