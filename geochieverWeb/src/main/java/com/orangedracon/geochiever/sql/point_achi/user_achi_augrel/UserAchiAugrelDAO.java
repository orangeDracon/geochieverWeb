package com.orangedracon.geochiever.sql.point_achi.user_achi_augrel;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author orangeDracon
 */
public interface UserAchiAugrelDAO {

    public void setDataSource(DataSource dataSource);

    public UserAchiAugrel getUserAchiAugrelData_byId(String id);

    public int getUserAchiAugrelCount_byUsername(String username);
    
    public List<UserAchiAugrel> getUserAchiAugrelRatingsList(); 
}
