package site.sanwater.modules.dict.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.dict.entity.DictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface DictDao extends BaseDao<DictEntity> {
	
}