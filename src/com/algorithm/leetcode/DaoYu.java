package com.algorithm.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class DaoYu {

    public void dfs(char[][] grid, int curR, int curC, int r, int c) {
        if (curR < 0 || curC < 0 || curR >= r || curC >= c || grid[curR][curC] == '0') {
            return;
        }
        grid[curR][curC] = '0';
        dfs(grid, curR, curC + 1, r, c);
        dfs(grid, curR, curC - 1, r, c);
        dfs(grid, curR + 1, curC, r, c);
        dfs(grid, curR - 1, curC, r, c);
    }

    public void landNumberDfs(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int num = 0;
        //[0,0]为根节点
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    dfs(grid, i, j, r, c);
                }
            }
        }

        System.out.println("dfs:" + num);
    }

    public void bfs(char[][] grid, int curR, int curC, int r, int c) {

    }

    public void landNumberBfs(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int num = 0;

        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        //[0,0]为根节点
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    queue.add(new Integer[]{i, j});
                    num++;
                    while (queue.size() > 0) {
                        Integer[] cur = queue.poll();
                        if (cur[0] > 0 && grid[cur[0] - 1][cur[1]] == '1') {
                            queue.add(new Integer[]{cur[0] - 1, cur[1]});
                            grid[cur[0] - 1][cur[1]] = '0';
                        }
                        if (cur[0] + 1 < r && grid[cur[0] + 1][cur[1]] == '1') {
                            queue.add(new Integer[]{cur[0] + 1, cur[1]});
                            grid[cur[0] + 1][cur[1]] = '0';
                        }
                        if (cur[1] > 0 && grid[cur[0]][cur[1] - 1] == '1') {
                            queue.add(new Integer[]{cur[0], cur[1] - 1});
                            grid[cur[0]][cur[1] - 1] = '0';
                        }
                        if (cur[1] + 1 < c && grid[cur[0]][cur[1] + 1] == '1') {
                            queue.add(new Integer[]{cur[0], cur[1] + 1});
                            grid[cur[0]][cur[1] + 1] = '0';
                        }
                    }
                }
            }
        }

        System.out.println("bfs:" + num);
    }

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '0', '1', '0'}};

        new DaoYu().landNumberDfs(grid);
        grid = new char[][]{{'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '0', '1', '0'}};
        new DaoYu().landNumberBfs(grid);
    }
}
