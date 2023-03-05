public class Study01 extends MyPrint {
    public static void main(String[] args) {
        Study01 study = new Study01();
        study.run();

    }
    @Override
    public void run() {
        Solution s = new Solution();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        print(s.solution(arr, 2));
    }

    class Solution {
        public int[][] solution(int[] num_list, int n) {
            int[][] answer = new int[num_list.length / n][n];

            for (int i = 0; i < num_list.length; i++) {
                answer[i / n][i % n] = num_list[i];
            }
            return answer;
        }
    }
}
