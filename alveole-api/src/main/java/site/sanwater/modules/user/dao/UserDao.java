package site.sanwater.modules.user.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity> {
	
}