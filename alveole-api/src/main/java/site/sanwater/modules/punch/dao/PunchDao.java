package site.sanwater.modules.punch.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.punch.entity.PunchEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 打卡内容 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface PunchDao extends BaseDao<PunchEntity> {
	
}