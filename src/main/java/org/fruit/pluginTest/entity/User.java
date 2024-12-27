package org.fruit.pluginTest.entity;

import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String displayName;
    private String rank;
    private Long money;
    private String job;
    private String prefix;
    private int kills;

    public User(UUID uuid, @NotNull String displayName, String rank, Long money, String job, String prefix, int kills){
        this.uuid = uuid;
        this.displayName = displayName;
        this.rank = rank;
        this.money = money;
        this.job = job;
        this.prefix = prefix;
        this.kills = kills;
    }

    public String getPrefix(){
        return prefix;
    }

    public void setPrefix(String prefix){
        this.prefix = prefix;
    }

    public UUID getUuid(){
        return uuid;
    }

    public void setUuid(UUID uuid){
        this.uuid = uuid;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getJob(){
        return job;
    }

    public String getDisplayName(){
        return displayName;
    }

    public void setDisplayName(String displayName){
        this.displayName = displayName;
    }

    public Long getMoney(){
        return money;
    }

    public void setMoney(Long money){
        this.money = money;
    }

    public void setKills(int kills){
        this.kills = kills;
    }

    public int getKills(){
        return kills;
    }
}
