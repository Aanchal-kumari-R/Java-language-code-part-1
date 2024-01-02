import java.util.Scanner;

public class sum_average_marks {   
    public static void main(string[] args) {
         
        int math,science,english,computer,sanskrit;    
        Scanner scan = new Scanner(System.in);  

        System.out.println("Enter the marks of math");  
        math=scan.nextInt();  
        System.out.println("Enter the marks of science"); 
        science =scan.nextInt();   
         System.out.println("Enter the marks of english"); 
         english =scan.nextInt(); 
         System.out.println("Enter the marks of computer"); 
        computer =scan.nextInt(); 
        System.out.println("Enter the marks of sanskrit"); 
        sanskrit=scan.nextInt();   

        int sum = math+science+english+computer+sanskrit;  

        System.out.println("The sum of all marks is:" +sum);  

        double average = sum/5;  
        System.out.println("The average is :"+average);


    }
    
}
