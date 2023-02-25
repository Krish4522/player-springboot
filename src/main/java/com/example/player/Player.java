// Write your code here.
package com.example.player;

public class Player{
    private int playerId;
    private String playerName;
    private String playerRole;
    private int playerJerseyNumber;

    public Player(int id, String name,int jerseyNum,String role){
        this.playerId = id;
        this.playerName = name;
        this.playerRole = role;
        this.playerJerseyNumber = jerseyNum;
    }

    public int getPlayerId(){
        return this.playerId;
    }

    public void setPlayerId(int id){
        this.playerId = id;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setPlayerName(String name){
        this.playerName = name;
    }
     
    public String getPlayerRole(){
        return this.playerRole;
    }

    public void setPlayerRole(String role){
        this.playerRole = role;
    }

    public int getPlayerJerseyNumber(){
        return this.playerJerseyNumber;
    }

    public void setPlayerJerseyNumber(int jerseyNum){
        this.playerJerseyNumber = jerseyNum;
    }
    
}