package org.fruit.pluginTest.entity;

import org.bukkit.entity.Player;

public class UserToMessage {
    public void uInfo(Player player, User playerData){
        player.sendMessage("----------------------------");
        player.sendMessage(String.format("이름 : %s", playerData.getDisplayName()));
        player.sendMessage(String.format("직업 : %s", playerData.getJob()));
        player.sendMessage(String.format("랭크 : %s", playerData.getRank()));
        player.sendMessage(String.format("칭호 : %s", playerData.getPrefix()));
        player.sendMessage(String.format("소지 금액 : %s", playerData.getMoney()));
        player.sendMessage(String.format("죽은 횟수: %d", playerData.getKills()));
        player.sendMessage("----------------------------");
    }
}
