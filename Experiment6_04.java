import java.util.Scanner;
public class Experiment6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;
        
        System.out.print("Input length =");
        p = input.nextInt();
        System.out.print("Input width =");
        l = input.nextInt();
        System.out.print("Input height =");
        t = input.nextInt();

        L = p * l;
        System.out.println("Area of the rectangle = " + L);
        vol = p * l * t;
        System.out.println("Volume of the rectangle = " + vol);
        
        input.close();
    }
}