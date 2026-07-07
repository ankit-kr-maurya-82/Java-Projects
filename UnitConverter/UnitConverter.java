
import java.util.Scanner;



public class UnitConverter{

    public static void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("=");
        }
    }
    public static void linebreak() {
        System.out.println("");
    }
    public static void Display(){
        line(30);
        linebreak();
        String[] display= {"Length", "Weight", "Temperature"};
        for(int i=0; i<display.length;i++){
            System.out.println(i+1+". "+display[i]);
        }
        line(30);
    }

    // Length function
    public static void LengthConverter() {
        linebreak();
        line(30);
        linebreak();
        System.out.println("Length Converter");
    }
    // Weight function
    public static void WeightConverter() {
        linebreak();
        line(30);
        linebreak();
        System.out.println("Weight Converter");
    }
    // Temperature function
    public static void TemperatureConverter() {
        linebreak();
        line(30);
        linebreak();
        System.out.println("Temperature Converter");
    }

    public static void main(String[] args){
        Display();
        linebreak();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a value to convert.");
        int options = sc.nextInt();
        if(options == 1){
            LengthConverter();
        }
        else if(options == 2){
            WeightConverter();
        }
        else if(options == 3){
            TemperatureConverter();
        }
}
}