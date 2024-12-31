import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        // int age = 20;
        // boolean isEligible = age >= 18 && age <= 65;
        // System.out.println(isEligible);
            Scanner scanner =new Scanner(System.in);
            System.out.println("You're playing a game press q or Q to Quit");
            String input = scanner.nextLine();
            // boolean quit = input.equals("q") || input.equals("Q");
            // if(input.equals("q")||input.equals("Q")){

            //     System.out.println("User wants to quit the game");
            // }else{
            //     System.out.println("You're still playiong the game PEW PEW");
            // }
            if(!input.equals("q") && !input.equals("Q")){

                System.out.println("You're still playiong the game PEW PEW");
            }else{
                System.out.println("User wants to quit the game");
            }
            
        }
}
