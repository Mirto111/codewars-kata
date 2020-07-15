package SevenKyu;

/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including them too and return it. If the two numbers are equal return a or b.
 *
 * Note: a and b are not ordered!
 *
 * Examples
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 *
 *
 *
 *
 */

public class SunOfNumbers {


  public static void main(String[] args) {


    System.out.println(GetSum(0,-1));

  }


  public static int GetSum(int a, int b)
  {
    int start;
    int end;

    if (a<b){
      start = a;
      end = b;
    }
    else{
      start = b;
      end = a;
    }

    int sum = start;

    for (int i = start; i < end; i++) {

      sum=sum+i+1;
    }

    return sum;
  }

}
