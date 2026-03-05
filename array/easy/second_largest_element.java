//aim:to find second largest element in a array
//method_1:using sorting
//method_2:using linear search and find max and then use another loop to find second largest element
//method_3:using linear search and find max and second max in one loop




//method_1:using sorting
//problem with this method is that it sort the whole array which is not required
// and if duplicate we will not get the element as lets say n-1 and n-2 are same then we will not get the second largest element as it will be same as largest element


//method_2:using linear search and find max and then use another loop to find second largest element
//its a good method but we can have more efficient method which is method_3




//method_3:using linear search and find max and second max in one loop
//time complexity is O(n) and space complexity is O(1)


import java.util.*;
public class second_largest_element {
   public static int second_largest(int arr[]){
    int max=Integer.MIN_VALUE;
    int second_max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            second_max=max;
            max=arr[i];
        }
        else if(arr[i]>second_max && arr[i]!=max){
            second_max=arr[i];
        }
    }
    return second_max;


   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int result=second_largest(arr);
    if(result==Integer.MIN_VALUE){
        System.out.println("there is no second largest element in the array");
    }
    else{
        System.out.println("second largest element in the array is: "+result);
    }
}


