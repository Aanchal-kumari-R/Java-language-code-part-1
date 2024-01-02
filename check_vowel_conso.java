import java.util.Scanner;

public class check_vowel_conso {

    public static void main(string[] args) {
        int ch;  
        System.out.println("Enter your character:");  
        Scanner scan = new Scanner(System.in);   
        ch = scan.next().charAt(0); 

        if(ch== 'i'||ch=='e'||ch=='o'|| ch=='u'||ch=='a'){ 
            System.out.println("vowel");
        }  
        else{ 
            System.out.println("Consonant");
        }
    }
}