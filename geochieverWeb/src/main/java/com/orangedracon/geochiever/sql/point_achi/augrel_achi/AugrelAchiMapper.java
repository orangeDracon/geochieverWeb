package com.orangedracon.geochiever.sql.point_achi.augrel_achi;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author orangeDracon
 */
public class AugrelAchiMapper implements RowMapper<AugrelAchi>{
    
    public AugrelAchi mapRow(ResultSet resultSet, int row) throws SQLException {
        
        AugrelAchi augrelAchi = new AugrelAchi();
        augrelAchi.setId(resultSet.getInt("id"));
        augrelAchi.setName(resultSet.getString("name"));
        augrelAchi.setDescription(resultSet.getString("description"));
        augrelAchi.setInfo(resultSet.getString("info"));
        augrelAchi.setLatitude_1(resultSet.getDouble("latitude_1"));
        augrelAchi.setLongitude_1(resultSet.getDouble("longitude_1"));
        augrelAchi.setLatitude_2(resultSet.getDouble("latitude_2"));
        augrelAchi.setLongitude_2(resultSet.getDouble("longitude_2"));
        augrelAchi.setLatitude_3(resultSet.getDouble("latitude_3"));
        augrelAchi.setLongitude_3(resultSet.getDouble("longitude_3"));
        augrelAchi.setLatitude_4(resultSet.getDouble("latitude_4"));
        augrelAchi.setLongitude_4(resultSet.getDouble("longitude_4"));
        augrelAchi.setLatitude_5(resultSet.getDouble("latitude_5"));
        augrelAchi.setLongitude_5(resultSet.getDouble("longitude_5"));
        augrelAchi.setTime_gold(resultSet.getTime("time_gold"));
        augrelAchi.setTime_silver(resultSet.getTime("time_silver"));
        augrelAchi.setTime_bronze(resultSet.getTime("time_bronze"));
        augrelAchi.setDate_added(resultSet.getDate("date_added"));
        augrelAchi.setLogo_url(resultSet.getString("logo_url"));   
        augrelAchi.setActive(resultSet.getInt("active"));
        
        return augrelAchi;
    }
    
}
