
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

    // ================================Length function========================

    // display length converter
    public static void DisplayLength(){
        line(30);
        linebreak();
        String[] display= {"Millimeter", "Centimeter"};
        for(int i=0; i<display.length;i++){
            System.out.println(i+1+". "+display[i]);
        }
        line(30);
    }


    // mm convert to cm
    public static void MilliToCenti(float mm) {
        float cm=mm/10;
        System.out.println(mm+" mm : "+cm+" cm");
    }
    // cm convert to mm
    public static void CentiToMilli(float cm) {
        float mm=cm*10;
        System.out.println(cm+" cm : "+mm+" mm");
    }
    // --------------------------Main Length function-----------------------------------------------
    public static void LengthConverter() {
        linebreak();
        line(30);
        linebreak();
        System.out.println("Length Converter");
        DisplayLength();
        linebreak();
        Scanner scfrom = new Scanner(System.in);
        System.out.print("Enter your choice convert from: ");
        int from = scfrom.nextInt();

        Scanner scto = new Scanner(System.in);
        System.out.print("Enter your choice convert to: ");
        int to = scto.nextInt();

        if(from == 1 && to == 2){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (mm): ");
            float mm = sc.nextFloat();
            MilliToCenti(mm);

        }else if(from == 2 && to == 1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (cm): ");
            float cm = sc.nextFloat();
            CentiToMilli(cm);
        }

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
        System.out.print("Input a value to convert: ");
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