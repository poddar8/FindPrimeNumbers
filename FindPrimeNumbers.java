import java.util.*;

public class FindPrimeNumbers {
    public static void main(String args[]) {
        String n = args[0];
        int num = Integer.parseInt(n);
        List<Integer> primeNumbers= new ArrayList<>();

        boolean isPrime;
        for(int j=num; j>1 ; j--){
            isPrime = true;
            int temp=j;
            for (int i=2;i<temp/2+1;i++ ){
                if(temp%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(temp);
            }
        }
        for (int e : primeNumbers)
            System.out.print( e+", ");
    }
}
