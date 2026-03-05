//aim:to find largest element in a array
//method_1:using sorting
//method_2:using linear search



//method_1:using sorting
//problem with this method is that it sort the whole array which is not required 
// and if duplicate we will not get the element




//method_2:using linear search
//time complexity is O(n) and space complexity is O(1)
//best method to find largest element in an array



import java.util.*;
public class largest_element {
   
    
public static int largest_element(int arr[]){
   int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    
}


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements of the array");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

//in the above code we are taking input from the user and storing it in an array and then we are calling the largest_element method to find the largest element in the array and then we are printing the largest element in the array




    int a=largest_element(arr);
    if(a==Integer.MIN_VALUE){
        System.out.println("array is empty");
    }
    else{
        System.out.println("largest element in the array is: "+a);
    }
}
}

