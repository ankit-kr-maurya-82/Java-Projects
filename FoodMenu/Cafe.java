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
                class foodItemContainer {
                    public void foodItem(){
                        System.out.println("Drinks [1]");
                        System.out.println("Snacks [2]");
                        
                        System.out.print("enter your choice: ");
                        int selectUser = sc.nextInt();
                        System.out.println("your choice: "+selectUser);
                    }
                }
                foodItemContainer foodObject = new foodItemContainer();
                foodObject.foodItem();
                break;
            case 2:
                System.out.println("\nGood Afternoon");
                class foodItemContainerTwo {
                    public void foodItemTwo(){
                        System.out.println("Chinise Dish [1]");
                        System.out.println("South Dish [2]");
                    }
                }
                foodItemContainerTwo foodObjectTwo = new foodItemContainerTwo();
                foodObjectTwo.foodItemTwo();
                break;
            case 3:
                System.out.println("\nGood Evening");
                class foodItemContainerThree {
                    public void foodItemThree(){
                        System.out.println("Special Thali [1]");
                        System.out.println("Normal Thali [2]");
                    }
                }
                foodItemContainerThree foodObjectThree = new foodItemContainerThree();
                foodObjectThree.foodItemThree();
                break;
            default:
                throw new AssertionError();
        }
    }

    // public static void 
    public static void main(String[] args) {
        displayTimeMenu();
        getUserTime();

    }
}