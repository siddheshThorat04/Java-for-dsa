import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Random random=new Random();
        int x=random.nextInt(1,6);
        double y=random.nextDouble(6)+1;
        boolean z=random.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
