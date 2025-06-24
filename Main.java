import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("I don't care");
        int a = oublic();
        System.out.println("You are " + a + ".");
    }
    public static double add(double a, double b){
        return a + b;
    }
    public static int oublic(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("What's your age? ");
        int aeg = scanner.nextInt();
        return aeg;
    }
}