public class EvenFibonacci {


  public static void main(String[] args) {
    int nMinus2 = 1;
    int nMinus1 = 2;
    int sum = 2;
    int i = nMinus1+nMinus2;
    while(i<=4000000){
      int tempInt = i;
      nMinus2 = nMinus1;
      nMinus1 = tempInt;
      i = nMinus1 + nMinus2;
      if(i%2==0){
        sum+=i;
      }
    }
    System.out.println("Sum: " + sum);
  }

}
