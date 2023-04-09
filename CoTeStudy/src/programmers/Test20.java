package programmers;

import java.util.LinkedList;

public class Test20 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0; // 사라진 인형의 개수
        LinkedList<Integer> stack = new LinkedList<>();
        for (int y: moves) {
            y = y - 1;
            for (int x = 0; x < board[y].length; x++) {
                if (board[x][y] == 0) continue;
                if (!stack.isEmpty() && stack.getLast() == board[x][y]) {
                    answer++;
                    stack.removeLast();
                } else {
                    stack.addLast(board[x][y]);
                }

                board[x][y] = 0;
                break;
            }
        }
        return answer * 2;
    }


    public Test20() {
//        복붙할 배열 만들기
//        System.out.println("[[0, 0, 0, 0, 0], [0, 0, 1, 0, 3], [0, 2, 5, 0, 1], [4, 2, 4, 4, 2], [3, 5, 1, 3, 1]], [1, 5, 3, 5, 1, 2, 1, 4]".replace("[", "{").replace("]","}"));

        // 예제1 _ 확인할 결과 값 :
        int[][] a = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] b = {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(this.solution( a, b ));
    }
}
