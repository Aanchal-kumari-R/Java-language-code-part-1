import java.util.Scanner;
public class Array {    

    public static void main(string[] args) {
        int a[] ={12,34,45,44,43,21,45,43};    // Dynamic Array
        System.out.println(a[2]);   

         
        int arr[] = new int[6];  
        arr[0] = 10;  
        arr[1] = 20;     // Static arrray
        arr[2] = 60;
        arr[3] =30;  
        arr[4] = 40; 
        arr[5] = 50;  
        for(int i = 0;i<=5;i++){ 
            System.out.println(arr[i]);
        }   

        string [] math = {"Star","Subtraction","Division","Multiplication","Remainder"}; 
        math[0] = "Addition";  
        System.out.println(math[0]);  
        for(string b:math){ 
            System.out.println(b);
        } 

        string [] cars = {"Baleno","Swift","Bolero","Scorpio","Volve"};   
        System.out.println(cars.length);
    }  

    }

