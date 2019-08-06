package site.sanwater.modules.user.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.user.entity.UserLoveEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 另一半关联表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface UserLoveDao extends BaseDao<UserLoveEntity> {
	
}