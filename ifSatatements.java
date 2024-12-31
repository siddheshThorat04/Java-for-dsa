import java.util.Scanner;

public class ifSatatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
         
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can drive");
        }
        else if(age==17){
            System.out.println("You can drive after 2 years");
        } 
        else{
            System.out.println("You can't drive");
        }
        sc.close();
    }
}
