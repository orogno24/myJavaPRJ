import java.util.*;

public class S10_17 {

    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] arr) {
        int[] answer;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) st.push(arr[i]);
            else if (st.peek() != arr[i]) st.push(arr[i]);
        }

        answer = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}
