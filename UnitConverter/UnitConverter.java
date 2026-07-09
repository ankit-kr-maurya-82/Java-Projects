
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
        String[] display= {"Millimeter", "Centimeter", "Meter", "Kilometer"};
        for(int i=0; i<display.length;i++){
            System.out.println(i+1+". "+display[i]);
        }
        line(30);
    }


    // 1. mm convert to cm
    public static void MilliToCenti(float mm) {
        float cm=mm/10;
        System.out.println(mm+" mm : "+cm+" cm");
    }
    // 2. cm convert to mm
    public static void CentiToMilli(float cm) {
        float mm=cm*10;
        System.out.println(cm+" cm : "+mm+" mm");
    }
    // 3. mm convert to m
    public static void MilliToMeter(float mm) {
        float m=mm/1000;
        System.out.println(mm+" mm : "+m+" m");
    }
    // 4. m convert to mm
    public static void MeterToMilli(float m) {
        float mm=m*1000;
        System.out.println(m+" m : "+mm+" mm");
    }
    // 5. m convert to cm
    public static void MeterToCenti(float m) {
        float cm=m*100;
        System.out.println(m+" m : "+cm+" cm");
    }
    // 6. cm convert to m
    public static void CentiToMeter(float cm) {
        float m=cm/100;
        System.out.println(cm+" cm : "+m+" m");
    }
    // 7. km convert to m
    public static void KilloToMeter(float km) {
        float m=km*1000;
        System.out.println(km+" km : "+m+" m");
    }

     // 8. m convert to km
    public static void MeterToKillo(float m) {
        float km=m/1000;
        System.out.println(m+" m : "+km+" km");
    }
    // 9. km convert to cm
    public static void KilloToCenti(float km) {
        float cm=km*100000;
        System.out.println(km+" km : "+cm+" cm");
    }
    // 10. cm convert to km
    public static void CentiToKillo(float cm) {
        float km=cm/100000;
        System.out.println(cm+" cm : "+km+" km");
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
        }else if(from == 1 && to == 3){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (mm): ");
            float mm = sc.nextFloat();
            MilliToMeter(mm);
        }else if(from == 3 && to == 1){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (m): ");
            float m = sc.nextFloat();
            MeterToMilli(m);
        }else if(from == 3 && to == 2){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (m): ");
            float m = sc.nextFloat();
            MeterToCenti(m);
        }else if(from == 2 && to == 3){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (cm): ");
            float cm = sc.nextFloat();
            CentiToMeter(cm);
        }else if(from == 4 && to == 3){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (km): ");
            float km = sc.nextFloat();
            KilloToMeter(km);
        }else if(from == 3 && to == 4){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (m): ");
            float meter = sc.nextFloat();
            MeterToKillo(meter);
        }else if(from == 4 && to == 2){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (km): ");
            float km = sc.nextFloat();
            KilloToCenti(km);
        }else if(from == 2 && to == 4){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number (cm): ");
            float cm = sc.nextFloat();
            CentiToKillo(cm);
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