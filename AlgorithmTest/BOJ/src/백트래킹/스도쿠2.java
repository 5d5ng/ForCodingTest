package 백트래킹;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 정올, 백트래킹1, 1824, 스도쿠 * * @author User *
 */
public class 스도쿠2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[9][9];
        for (int x = 0; x < 9; x++) for (int y = 0; y < 9; y++) array[x][y] = in.nextInt();
        in.close();
        ArrayList<int[]> list = new ArrayList<>();
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (array[x][y] == 0) list.add(new int[]{x, y});
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i)[0]+" "+list.get(i)[1]);
        }
        check(array, list, 0);
    }

    public static void check(int[][] array, ArrayList<int[]> list, int index) {
        if (index == list.size()) {
            for (int[] ss : array) {
                for (int n : ss) {
                    System.out.printf("%d ", n);
                }
                System.out.println();
            }
            System.exit(1);
            return;
        }
        int[] loc = list.get(index);
        int x = loc[0];
        int y = loc[1];

        for (int i = 1; i < 10; i++) {
            if (isAvailable(array, x, y, i)) {
                array[x][y] = i;
                check(array, list, index + 1);
                array[x][y] = 0;
            }
        }
    }

    /**
     * 해당값이 입력이 가능한지 확인
     */
    public static boolean isAvailable(int[][] sudoku, int x, int y, int target) {
        for (int xx = 0; xx < sudoku.length; xx++) {
            if (sudoku[xx][y] == target || sudoku[x][xx] == target) return false;
        }
        int xk = x / 3 * 3;
        int yk = y / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[xk + i][yk + j] == target) return false;
            }
        }
        return true;
    }
}
