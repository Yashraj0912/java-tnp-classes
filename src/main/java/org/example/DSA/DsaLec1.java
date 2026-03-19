package org.example.DSA;

import java.util.HashMap;

class questions {
    public int subArray(int [] arr , int k){
        int maxSum =0;
        int currSum =0;
        int left =0;
        HashMap<Integer,Integer> help = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            help.put(arr[i], help.getOrDefault(arr[i],0) +1);
            currSum += arr[i];
            while(help.size()>k){
                help.put(arr[left], help.get(arr[left])-1);
                if(help.get(arr[left])==0){
                    help.remove(arr[left]);
                }
                currSum -=  arr[left];
                left++;
            }
            maxSum= Math.max(maxSum,currSum);
        }


        return maxSum;
    }
}

public class DsaLec1 {

    // the function for querrie
    public static int querry(int[] arr , int [][] querry){
        int sum=0;
        for(int i=0; i<querry.length;i++){
            if(querry[i][0]==1){
                int a= arr[querry[i][1]];
                for(int j=querry[i][1]; j <= querry[i][2];j++){
                    arr[j] = (j- querry[i][1] +1 )*a;
                }
            }
            else{
                for(int j=querry[i][1]; j<= querry[i][2];j++){
                    sum +=arr[j];
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,1,6,7,8};
        int [][] querry ={
                {1,1,6},
                {1,1,5},
                {2,5,5},
                {2,3,4},
                {2,3,3}
        };
        int s= querry(arr,querry);
      //  System.out.println(s);
        questions q= new questions();
        int [] ans = {1,2,2,3,2,3,5,1,2,1,1};

        System.out.println(   q.subArray(ans , 2));
    }
}
