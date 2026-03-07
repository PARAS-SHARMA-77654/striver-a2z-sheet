//aim:to find third largest element in a array
//method_1:using sorting
//method_2:using linear search and find max and then use another loop to find third largest element
//method_3:using linear search and find max and third max in one loop




//method_1:using sorting
//problem with this method is that it sort the whole array which is not required
// and if duplicate we will not get the element as lets say n-1 and n-2 are same then we will not get the second largest element as it will be same as largest element


//method_2:using linear search and find max and then use another loop to find third  largest element
//its a good method but we can have more efficient method which is method_3




//method_3:using linear search and find max and third max in one loop
//time complexity is O(n) and space complexity is O(1)

import java.util.*;
public class third_largest_element {
      public static int third_largest(int arr[]) {
             int max1=Integer.MIN_VALUE;
             int max2=Integer.MIN_VALUE;
             int max3=Integer.MIN_VALUE;
             for(int i=0;i<arr.length;i++){
                   if (arr[i]>max1){
                       max3=max2;
                       max2=max1;
                       max1=arr[i];
                   }
                    else if(arr[i]<max1 && arr[i]>max2){
                          max3=max2;
                          max2=arr[i];
                    }
                    else if(arr[i]<max2 && arr[i]>max3){
                          max3=arr[i];
                    }

                }
                return max3 ;
                    
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int result=third_largest(arr);
    if(result==Integer.MIN_VALUE){
        System.out.println("there is no third largest element in the array");
    }
    else{
        System.out.println("third largest element in the array is: "+result);
    }
}
}