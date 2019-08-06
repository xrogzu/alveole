package site.sanwater.modules.love.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.love.entity.LoveDiaryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 情侣日记 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface LoveDiaryDao extends BaseDao<LoveDiaryEntity> {
	
}