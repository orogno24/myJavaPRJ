package ZanDi06;

public class ZanDi0619 {
    public static void main(String[] args) {

        String poly = "한국폴리텍대학강서캠퍼스";

        String[] split = poly.split("강");

        String s1 = split[0];

        String s3 = s1.replace("폴리텍", " 폴리텍");

        if (!s3.startsWith("["))
            System.out.print("[");

        System.out.print(s3);

        if (!s3.endsWith("]"))
            System.out.print("]");
    }
}
