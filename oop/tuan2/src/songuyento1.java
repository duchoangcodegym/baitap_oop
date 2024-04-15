public class songuyento1 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        System.out.println("20 số nguyên đầu tiên là : ");
        while (count<20){
            if (isPrime(number)){
                System.out.print(number+ " " );
                count ++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number){
        for(int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
