package top.gonefuture.netty.games.service;

import org.springframework.stereotype.Service;
import top.gonefuture.netty.games.cache.manager.GameCacheManager;
import top.gonefuture.netty.games.common.MapMarker;
import top.gonefuture.netty.games.entity.map.GameMap;
import top.gonefuture.netty.games.entity.map.Position;
import top.gonefuture.netty.games.entity.role.Adventurer;
import top.gonefuture.netty.games.entity.role.Role;

/**
 * @author gonefuture  gonefuture@qq.com
 * time 2018/9/12 11:44
 * @version 1.00
 * Description: JavaLearn
 */

@Service
public class RoleMoveService {

    private GameMap  gameMap = new GameMap("桃花源",10,10);
    private MapMarker[][] map = new MapMarker[10][10];
    private  static GameCacheManager gameCacheManager = GameCacheManager.getInstance();


    {
        // 初始化
        initMap();
    }

    // 初始化地图
    private void initMap() {
        for (int i=0; i < 10; i++) {
            for (int j=0; j < 10; j++) {
                if (i == j) {
                    map[i][j] = MapMarker.HILL;
                } else {
                    map[i][j] = MapMarker.ROAD;
                }
            }
        }
        // 设置地图
        gameMap.setMap(map);
    }

    public String move() {

        return currentLocation();
    }

    public String currentLocation() {
        Role role = (Adventurer) gameCacheManager.get("hero");
        Position p = role.getPosition();
        map[p.getX()][p.getY()] = MapMarker.ROLE;
        return gameMap.StringMap();
    }



}
