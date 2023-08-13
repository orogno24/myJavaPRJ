package Zandi_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Zandi0813 {
    public static void main(String[] args) throws IOException {

        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(s.readLine());

        for (int i = 0; i < n; i++) {
            int[] al = new int[26];
            String st = s.readLine();

            for (int j = 0; j < st.length(); j++) {
                char c = st.charAt(j);
                al[c - 65]++;
            }
            int hap = 0;
            for (int k = 0; k < al.length; k++) {
                if (al[k] == 0) {
                    hap += k + 65;
                }
            }
            System.out.println(hap);
        }
    }
}