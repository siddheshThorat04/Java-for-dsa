import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String Name= "";  
        
        while(Name.isBlank()){
            System.out.print("Enter your name : ");
            Name= scanner.nextLine();
        }

        System.out.println("Name is "+Name);
    }
}
