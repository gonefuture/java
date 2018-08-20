package top.gonefuture.niuke.ali._0814;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/8/14 16:09
 * @version 1.00
 * Description: JavaLearn
 */

import java.util.Scanner;

/**
 * 如图，某物流派送员p，需要给a、b、c、d4个快递点派送包裹，请问派送员需要选择什么的路线，才能完成最短路程的派送。
 * 假设如图派送员的起点坐标(0,0)，派送路线只能沿着图中的方格边行驶，每个小格都是正方形，且边长为1，如p到d的距离就是4。
 * 随机输入n个派送点坐标，求输出最短派送路线值（从起点开始完成n个点派送并回到起始点的距离）。
 */

/*
    创建坐标类
 */
class Point{
    private int x;
    private int y;
    private boolean visited;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.visited = false;
    }

    boolean isVisited() {
        return visited;
    }

    void setVisited(boolean visited) {
        this.visited = visited;
    }

    int getLength(Point p){
        return Math.abs(x - p.x) + Math.abs(y - p.y);
    }
}

public class Main {

    // 最短距离
    private static int min = Integer.MAX_VALUE;

    private static final Point START = new Point(0,0);

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // 定义点集
        Point[] points = new Point[n];
        for(int i = 0; i<n; i++){
            String[] line = sc.nextLine().trim().split(",");
            points[i] = new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
        }
        int min = find(START, points, 0, 0);
        System.out.println(min);
    }



    /*
        回溯法
     */

    private static int find(Point start, Point[] points, int sum, int count){
        if(count == points.length){
            min = Math.min(min, sum +start.getLength(START));
            return min;
        }
        for(int i = 0; i<points.length; i++){
            if(points[i].isVisited() == false){
                // 试探
                sum += points[i].getLength(start);
                if(sum < min){
                    points[i].setVisited(true);
                    // 递归查找
                    find(points[i], points, sum, count+1);
                }
                // 恢复条件，回溯
                sum -= points[i].getLength(start);
                points[i].setVisited(false);
            }
        }
        return min;
    }

}






