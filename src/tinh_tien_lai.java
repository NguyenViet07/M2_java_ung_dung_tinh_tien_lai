import java.util.Scanner;

public class tinh_tien_lai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter so tien gui: ");
        money = input.nextDouble();
        System.out.print("Enter so thang gui: ");
        month = input.nextInt();
        System.out.print("Enter lai: ");
        rate = input.nextDouble();
        double total = money*month*(rate/100)/12;
        System.out.print("So tien lai la: "+total);
    }
}
