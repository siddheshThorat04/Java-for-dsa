import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String Name= "";
        
    
    do{
        System.out.print("Enter your name : ");
        Name = scanner.nextLine();
    }while(Name.isBlank());
    
    System.out.println("Name is "+Name);
}
}
