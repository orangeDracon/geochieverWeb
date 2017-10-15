package com.orangedracon.geochiever.sql.point_achi.augrel_achi;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author orangeDracon
 */
public class AugrelAchiJDBCTemplate implements AugrelAchiDAO{
        
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public AugrelAchi getAugrelAchiData_byId(String id){
        String sqlComm = "SELECT * FROM augrel_achievement WHERE id = ?";
        AugrelAchi augrelAchi = jdbcTemplate.queryForObject(sqlComm, new Object[]{id}, new AugrelAchiMapper());
        
        return augrelAchi;
    }
    
    public List<AugrelAchi> getAchievedUserAugrelAchi_byUsername(String username, int isActive){
        String sqlComm = "SELECT * FROM augrel_achievement aa, user_achievement_augrel uaa, user u "
                       + "WHERE u.id_user = uaa.user_id AND uaa.achievement_id = aa.id AND u.username = ? AND aa.active = ?";
        List<AugrelAchi> userAchievedAugrelAchiList = jdbcTemplate.query(sqlComm, new Object[]{username, isActive}, new AugrelAchiMapper());
        
        return userAchievedAugrelAchiList;
    }
    
    public List<AugrelAchi> getUndoneUserAugrelAchi_byUsername(String username, int isActive){
        String sqlComm = "SELECT * FROM augrel_achievement aa "
                       + "WHERE NOT EXISTS ( "
                       + "SELECT * FROM user_achievement_augrel uaa, user u "
                       + "WHERE u.id_user = uaa.user_id AND uaa.achievement_id = aa.id AND u.username = ? AND aa.active = ?)";
        List<AugrelAchi> userUndoneAugrelAchiList = jdbcTemplate.query(sqlComm, new Object[]{username, isActive}, new AugrelAchiMapper());
        
        return userUndoneAugrelAchiList;
    }
    
    public List<AugrelAchi> getLatestAugrelAchi_byUsername(String username){
        String sqlComm = "SELECT * FROM augrel_achievement aa, user_achievement_augrel uaa, user u "
                       + "WHERE u.id_user = uaa.user_id AND uaa.achievement_id = aa.id AND u.username = ? ORDER BY uaa.date_achieved DESC LIMIT 3";
        List<AugrelAchi> latestZoneAchiList = jdbcTemplate.query(sqlComm, new Object[]{username}, new AugrelAchiMapper());
        
        return latestZoneAchiList;
    }
}
