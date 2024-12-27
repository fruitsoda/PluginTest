package org.fruit.pluginTest.controller.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.fruit.pluginTest.entity.User;
import org.fruit.pluginTest.entity.UserToMessage;
import org.fruit.pluginTest.service.UserManager;
import org.jetbrains.annotations.NotNull;

public class UserInfoCommand implements CommandExecutor {

    private final UserManager userManager;
    private final UserToMessage messageToUser = new UserToMessage();
    public UserInfoCommand(UserManager userManager){
        this.userManager = userManager;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args){
        if (!(sender instanceof Player)){
            sender.sendMessage("플레이어만 입력이 가능합니다.");
            return false;
        }

        Player player = (Player) sender;
        User playerData = userManager.getUserData(player);

        messageToUser.uInfo(player, playerData);

        playerData.setMoney(playerData.getMoney() + 10L);

        return false;
    }
}
