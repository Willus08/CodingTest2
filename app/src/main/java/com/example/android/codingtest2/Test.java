package com.example.android.codingtest2;

/**
 * Created by Android on 6/30/2017.
 */

public class Test {

    public static void main(String[] args) {
        System.out.println(palindrome("doom"));
        System.out.println(numberSearch(new int[]{11,11,8,11,11,8,8,8,8,2,2,2,2,2,2,2,2,2,2,2,2}));
        System.out.println(fizzBuzz(3));
        System.out.println(isArmstrong(153));
    }

    public static Boolean palindrome(String s){

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                return false;
            }

        }
        return true;

    }

    public static Integer numberSearch(int[] num){
        int ans = 0;
        int largeCount=0;
        int current =0;
        int currentCount =0;
        for (int i = 0; i < num.length ; i++) {

            for (int j = 0; j <num.length ; j++) {
                if (num[i] < num[j]){
                    int tem = num[i];
                    num[i] = num[j];
                    num[j] = tem;
                }

            }

        }

        for (int i = 0; i <num.length ; i++) {
            if(num[i] != current)
            {
                if (currentCount > largeCount){
                    ans = current;
                    largeCount = currentCount;
                }
                    current = num[i];
                    currentCount = 1;


            }else{
                currentCount++;
            }
        }

        return ans;
    }

    public static String fizzBuzz(int i){
        if (i%15 == 0)
            return "fizz buzz";
        if(i%5 == 0)
            return "buzz";
        if (i%3 == 0){
            return "fizz";
        }
        return ""+ i;
    }

    public static Boolean isArmstrong(int a){
        int hundreds = a/100;
        int tens = (a -(100*hundreds))/10;
        int ones = (a - (100*hundreds) - (10*tens) );
        System.out.println(hundreds);
        System.out.println(tens);
        System.out.println(ones);
        return (Math.pow(ones,3) +Math.pow(tens,3) + Math.pow(hundreds,3) == a);

    }


}
