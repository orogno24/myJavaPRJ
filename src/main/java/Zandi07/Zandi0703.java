package Zandi07;

public class Zandi0703 {
        static int Stack[] = new int[5];
        static int Top = -1;
    public static void main(String[] args) {
        push(100);
        push(110);
        push(120);
        pop();
        push(130);
        push(140);
        pop();
    }

    static void push (int i){
        Top++;
        if(Top >= 5){
            System.out.print("오버플로우");
        } else Stack[Top] = i;
    }

    static void pop(){
        if(Top < 0)
            System.out.print("언더플로우");
        else System.out.printf("%d제거\n", Stack[Top--]);
    }

}