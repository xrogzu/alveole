package site.sanwater.modules.punch.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.punch.entity.PunchLoveEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 情侣打卡 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface PunchLoveDao extends BaseDao<PunchLoveEntity> {
	
}