public class songuyento2 {
    public static void main(String[]args) {
      for (int i=2;i<100;i++) {
         if(isPrime(i)){
             System.out.print(i + " ");
         }
        }
      }
      public static boolean isPrime(int number){
        for (int i=2;i<=number/2;i++){
            if (number%i ==0){
                return false;
            }
        }
        return true;
      }
    }