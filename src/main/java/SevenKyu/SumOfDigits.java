package SevenKyu;


public class SumOfDigits {


  public static void main(String[] args) {

   //int n = digital_root(493193);
    int other = digital_rootOther(493193);
    System.out.println(other);
  }

  public static int digital_root(int n) {
    // ...

    char digits[] = String.valueOf(n).toCharArray();

    if (digits.length==1){
      return n;
    }

    int sum=0;

    for (char digit : digits) {
      sum = sum + Character.getNumericValue(digit);
    }

      return digital_root(sum);
  }

  public  static int digital_rootOther(int n){

    while(n > 9){
      n = n/10 + n % 10;
      System.out.println(n);
    }
    return(n);
  }


}
