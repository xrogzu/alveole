/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.sys.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.sys.entity.SysRoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 角色管理
 * 
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity> {
	

}
