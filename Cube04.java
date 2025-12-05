import java.util.Scanner;

public class Cube04 {
     static int calculateArea (int s){
        int area = s * s;
        return area;
    }
    static int calculateVolume (int s){
        int vol = calculateArea(s) * s;
        return vol;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input length = ");
        int s = inp.nextInt();
        System.out.println("Area of cube = " + calculateArea(s));
        System.out.println("Volume of cube = " + calculateVolume(s));
    }
}