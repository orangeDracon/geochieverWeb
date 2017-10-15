package com.orangedracon.geochiever.sql.point_achi.user_achi_augrel;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author orangeDracon
 */
public class UserAchiAugrel {

    private int id;
    private int user_id;
    private int achievement_id;
    private Date date_achieved;
    private Time time;

    private String username;
    
    private int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAchievement_id() {
        return achievement_id;
    }

    public void setAchievement_id(int achievement_id) {
        this.achievement_id = achievement_id;
    }

    public Date getDate_achieved() {
        return date_achieved;
    }

    public void setDate_achieved(Date date_achieved) {
        this.date_achieved = date_achieved;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
