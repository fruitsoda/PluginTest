package org.fruit.pluginTest.controller;

import org.fruit.pluginTest.Main;
import org.fruit.pluginTest.controller.commands.UserInfoCommand;
import org.fruit.pluginTest.service.UserManager;

public class UserManagementController {

    private static UserManager userManager;
    private final Main serverInstance;
    private UserConnectionController userConnectionController;

    public UserManagementController(){
        this.userManager = new UserManager();
        this.serverInstance = Main.getServerInstance();

        this.userConnectionController = new UserConnectionController(userManager);

        registerCommand();
        registerEvent();
    }

    private void registerEvent(){
        serverInstance.getServer().getPluginManager().registerEvents(userConnectionController, serverInstance);
    }

    private void registerCommand(){
        serverInstance.getServer().getPluginCommand("uinfo").setExecutor(new UserInfoCommand(userManager));
    }
}

// UserConnectionController에서 구현한 이벤트 핸들러를 서버 인스턴스에 등록
