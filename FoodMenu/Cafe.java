import java.util.*;

public class Cafe{
    public static void displayTimeMenu(){
        System.out.println("------------------Time-----------------");
        System.out.println("Say Good Morning (1)");
        System.out.println("Say Good Afternoon (2)");
        System.out.println("Say Good Evening (3)");
    }
    
    public static void getUserTime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Time: ");
        int time = sc.nextInt();
        switch(time) {
            case 1:
                System.out.println("\nGood Morning");
                break;
            case 2:
                System.out.println("\nGood Afternoon");
                break;
            case 3:
                System.out.println("\nGood Evening");
                break;
            default:
                throw new AssertionError();
        }
    }
    public static void main(String[] args) {
         displayTimeMenu();
         getUserTime();
    }
}