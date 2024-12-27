package org.fruit.pluginTest.service;

import org.bukkit.entity.Player;
import org.fruit.pluginTest.entity.User;

import java.util.HashMap;

public class UserManager {
    private HashMap<Player, User> onlineUserData = new HashMap<>();

    public void addUser(Player player){
        User newUser = new User(
                player.getUniqueId(),
                player.getDisplayName(),
                "newbie",
                1000L,
                "jobless",
                "[뉴비]",
                0
        );
        onlineUserData.put(player, newUser);
    }

    public void removeUser(Player player){
        onlineUserData.remove(player);
    }

    public User getUserData(Player player){
        return onlineUserData.get(player);
    }

    public void addKills(Player player){
        int count = onlineUserData.get(player).getKills();
        onlineUserData.get(player).setKills(count + 1);
    }
}

// 유저 데이터를 처리하는 모델