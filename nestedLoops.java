import java.util.Scanner;
public class nestedLoops {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int columns ;
            int rows ;
            System.out.print("Enter the number of columns: ");
            columns=scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            rows=scanner.nextInt();
            System.out.println("Enter the Symbol you want to print: ");
            String Symbol=scanner.next();
            
            for(int  i=1;i<=rows;i++ ){
                for(int j=1;j<=columns;j++){
                    System.out.print(Symbol);

                }
                System.out.print("\n");

            }



    }   
}