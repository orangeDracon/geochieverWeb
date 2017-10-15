package com.orangedracon.geochiever.sql.point_achi.user_achi_augrel;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author orangeDracon
 */
public class UserAchiAugrelJDBCTemplate implements UserAchiAugrelDAO {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public UserAchiAugrel getUserAchiAugrelData_byId(String id) {
        String sqlComm = "SELECT * FROM user_achievement_augrel WHERE id = ?";
        UserAchiAugrel userAchiAugrel = jdbcTemplate.queryForObject(sqlComm, new Object[]{id}, new UserAchiAugrelMapper());

        return userAchiAugrel;
    }

    public int getUserAchiAugrelCount_byUsername(String username) {
        String sqlComm = "SELECT COUNT(*) FROM user_achievement_augrel uaa, user u WHERE u.id_user = uaa.user_id AND u.username = ?";
        int userAchiAugrelCount = jdbcTemplate.queryForObject(sqlComm, Integer.class, username);

        return userAchiAugrelCount;
    }

    public List<UserAchiAugrel> getUserAchiAugrelRatingsList(){
        String sqlComm = "SELECT *, COUNT( * ) AS 'count' FROM user_achievement_augrel uaa, user u "
                       + "WHERE u.id_user = uaa.user_id "
                       + "GROUP BY u.username "
                       + "ORDER BY COUNT( * ) DESC ";
        List<UserAchiAugrel> userAchiAugrelRatingsList = jdbcTemplate.query(sqlComm, new Object[]{}, new UserAchiAugrelMapper());
        
        return userAchiAugrelRatingsList;
    }
}
