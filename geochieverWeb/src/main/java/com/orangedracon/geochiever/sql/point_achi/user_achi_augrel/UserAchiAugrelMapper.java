package com.orangedracon.geochiever.sql.point_achi.user_achi_augrel;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author orangeDracon
 */
public class UserAchiAugrelMapper implements RowMapper<UserAchiAugrel> {
    
    public UserAchiAugrel mapRow(ResultSet resultSet, int row) throws SQLException {
        
        UserAchiAugrel userAchiAugrel = new UserAchiAugrel();
        
        userAchiAugrel.setId(resultSet.getInt("id"));
        userAchiAugrel.setUser_id(resultSet.getInt("user_id"));
        userAchiAugrel.setAchievement_id(resultSet.getInt("achievement_id"));
        userAchiAugrel.setDate_achieved(resultSet.getDate("date_achieved"));        
        userAchiAugrel.setTime(resultSet.getTime("time"));
        
        userAchiAugrel.setUsername(resultSet.getString("username"));
        
        userAchiAugrel.setCount(resultSet.getInt("count"));
        
        return userAchiAugrel;
    }
    
}
