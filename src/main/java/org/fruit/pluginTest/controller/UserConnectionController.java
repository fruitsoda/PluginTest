package org.fruit.pluginTest.controller;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.fruit.pluginTest.Main;
import org.fruit.pluginTest.service.UserManager;

import javax.xml.stream.events.EntityReference;

public class UserConnectionController implements Listener {

    private final UserManager userManager;

    UserConnectionController(UserManager userManager){
        this.userManager = userManager;
    }

    @EventHandler
    public void onUserJoinServer(PlayerJoinEvent event){
        userManager.addUser(event.getPlayer());
        Main.getServerInstance().getLogger().info("플레이더 데이터 저장");
    }

    @EventHandler
    public void onUserQuitFromServer(PlayerQuitEvent event) {
        userManager.removeUser(event.getPlayer());
        Main.getServerInstance().getLogger().info("플레이어 데이터 삭제");
    }

    @EventHandler
    public void onPlayerKilled(PlayerDeathEvent event){
        userManager.addKills(event.getPlayer());
        Main.getServerInstance().getLogger().info("플레이어 죽은 숫자 증가");
    }

    @EventHandler
    public void onPlayerKillsAny(EntityDeathEvent event){
        
    }
}
// Controller는 이벤트 처리 담당하는 역할
// 유저가 어떤 행동을 했을 경우 해당 이벤트핸들러를 여기에 구현