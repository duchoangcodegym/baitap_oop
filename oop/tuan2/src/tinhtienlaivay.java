import java.util.Scanner;

public class tinhtienlaivay {
    public static void main(String[] args) {



        double tiengui = 1.0;
        int thang =1;
        double laisuat =1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền cho vay : ");
        tiengui = scanner.nextDouble();
        System.out.println("Nhập số tháng vay :");
        thang = scanner.nextInt();
        System.out.println("Nhập lãi suất : ");
        laisuat = scanner.nextDouble();
        double inlaisuat = 0 ;
        for (int i = 0; i < thang;i++){
            inlaisuat += tiengui * (laisuat/100)/12 * thang;

        }
        System.out.println("Tiền phải trả : " + inlaisuat);
    }
}
