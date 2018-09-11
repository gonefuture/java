package top.gonefuture.netty.games.gameMaps;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/10 16:49
 * @version 1.00
 * Description: JavaLearn
 */
public interface IGameMap {


    // 初始化地图并返回
    int[][] init();

    // 设置一个地图
    int[][] getMap();

    // 设置一个地图
    void setMap(int[][] map);

}
