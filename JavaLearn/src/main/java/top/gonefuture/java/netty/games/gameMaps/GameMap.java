package top.gonefuture.java.netty.games.gameMaps;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/10 15:49
 * @version 1.00
 * Description: JavaLearn
 */
public  class GameMap implements IGameMap{

    // 地图名字
    private String gameMapName;

    // 行与列
    private int row;
    private int clomn;

    private int[][] map = new int[row][clomn];

    GameMap() {

    }

    GameMap(String name, int row, int clumn) {
        this.gameMapName = name;
        this.row = row;
        this.clomn = clumn;
    }

    @Override
    public int[][] init() {
        return null;
    }

    @Override
    public int[][] getMap() {
        return map;
    }

    @Override
    public void setMap(int[][] map) {
        this.map = map;
    }
}
