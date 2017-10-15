package com.orangedracon.geochiever.sql.point_achi.augrel_achi;

import java.util.List;
import javax.sql.DataSource;

/**
 *
 * @author orangeDracon
 */
public interface AugrelAchiDAO {
    
    public void setDataSource(DataSource dataSource);
    
    public AugrelAchi getAugrelAchiData_byId(String id);
    
    public List<AugrelAchi> getAchievedUserAugrelAchi_byUsername(String username, int isActive);
    
    public List<AugrelAchi> getUndoneUserAugrelAchi_byUsername(String username, int isActive);
    
    public List<AugrelAchi> getLatestAugrelAchi_byUsername(String username);
    
}
