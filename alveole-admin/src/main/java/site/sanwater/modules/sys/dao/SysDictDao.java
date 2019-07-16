/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.sys.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 数据字典
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysDictDao extends BaseDao<SysDictEntity> {

    /**
     * 修改字典类型
     * @param dictType  字典类型
     * @param pid       pid
     */
	void updateDictType(@Param("dictType") String dictType, @Param("pid") Long pid);

}
