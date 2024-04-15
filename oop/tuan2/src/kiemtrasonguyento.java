import java.util.Scanner;

public class kiemtrasonguyento {

        public static void main(String[] args) {
        Scanner scanner = new
                Scanner(System.in);
        System.out.print("Nhập số vào đây để kiểm tra : ");
        int number = scanner.nextInt();
        if (number<2){
                System.out.print(number + "không phải là số nguyên tố ");
        }
        else {
        int i=2;
        boolean check = true;
        while (i < number){
                if (number%i ==0){
                        check = false;
                        break;
                }
                i++;
        }
        if (check)
                System.out.println(number + " đây là số nguyên tố");
        else
                System.out.println(number+ "đây không phải là số nguyên tố ");
        }
}
        }