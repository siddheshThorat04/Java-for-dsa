
import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your name : ");
        String Name= scanner.nextLine();  
        System.out.println("Enter your age : ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourrite food ?");
        String food= scanner.nextLine();

        System.out.println("Name is "+Name);
        System.out.println("Age is "+age);
        System.out.println("Favourite food is "+food); 

    }

    
}