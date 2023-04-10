package Training;

import java.util.Scanner;

public class Training0406 {
  public static void main(String[] args){
      int a, b, c;
      float x = 0;
      Scanner s = new Scanner(System.in);
      System.out.printf("배열의 길이를 지정하세요 : ");
      a = s.nextInt();
      int ax[] = new int [a];
      for(b = 0;b < ax.length;b++){
          System.out.printf("배열의 %d칸의 값을 입력하세요 : ", b+1);
          ax[b] = s.nextInt();
      }
      for(c = 0;c < ax.length;c++){
          x += ax[c];
      }

      x = x / (float) a;
      System.out.printf("배열의 평균값 : %2.1f", x);
  }
}
