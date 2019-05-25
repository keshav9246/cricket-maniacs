package com.cricket.wc2019.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
@Table(name = "Players")
public class Player {


    @Id

    private String playername;
    //private enum playerRole{Opener,MiddleOrder,WicketKeeper,Spinner,FastBowler,AllRounder};
    private String playerrole;
    private int playerscore;
    private boolean iscaptain;
    //private enum teamName{INDIA,ENGLAND,AUSTRALIA,SOUTHAFRICA,NEWZELAND,SRILANKA, AFGHANISTAN,BANGLADESH, PAKISTAN,WESTINDIES};
    private String teamname;





    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getPlayerrole() {
        return playerrole;
    }

    public void setPlayerrole(String playerrole) {
        this.playerrole = playerrole;
    }

    public int getPlayerscore() {
        return playerscore;
    }

    public void setPlayerscore(int playerscore) {
        this.playerscore = playerscore;
    }

    public boolean isIscaptain() {
        return iscaptain;
    }

    public void setIscaptain(boolean iscaptain) {
        this.iscaptain = iscaptain;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
}
