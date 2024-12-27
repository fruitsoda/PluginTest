package org.fruit.pluginTest;

import org.bukkit.plugin.java.JavaPlugin;
import org.fruit.pluginTest.controller.UserManagementController;

public final class Main extends JavaPlugin {

    private static Main serverInstance;
    private static UserManagementController userManagement;

    @Override
    public void onEnable() {
        serverInstance = this;
        userManagement = new UserManagementController();

        getLogger().info("플러그인 시작 테스트");
    }

    @Override
    public void onDisable() {
        serverInstance = null;
        userManagement = null;
        
        getLogger().info("플러그인 종료 테스트");
    }

    public static Main getServerInstance(){
        return serverInstance;
    }
}
