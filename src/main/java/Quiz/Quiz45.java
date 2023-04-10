package Quiz;

public class Quiz45 {
  public static void main(String[] args){
      int a = 2;
      int b = 1;

      while (a < 10){
          System.out.printf(" %d * %d = %2d ",a,b,a*b);
          b++;

          if(b>9){
              a++;
              b = 1;
              System.out.println();
          }
      }
  }
}
