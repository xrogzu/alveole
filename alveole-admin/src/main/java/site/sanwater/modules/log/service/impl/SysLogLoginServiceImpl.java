/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.log.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import site.sanwater.common.constant.Constant;
import site.sanwater.common.page.PageData;
import site.sanwater.common.service.impl.BaseServiceImpl;
import site.sanwater.common.utils.ConvertUtils;
import site.sanwater.modules.log.dao.SysLogLoginDao;
import site.sanwater.modules.log.dto.SysLogLoginDTO;
import site.sanwater.modules.log.entity.SysLogLoginEntity;
import site.sanwater.modules.log.service.SysLogLoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 登录日志
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Service
public class SysLogLoginServiceImpl extends BaseServiceImpl<SysLogLoginDao, SysLogLoginEntity> implements SysLogLoginService {

    @Override
    public PageData<SysLogLoginDTO> page(Map<String, Object> params) {
        IPage<SysLogLoginEntity> page = baseDao.selectPage(
            getPage(params, Constant.CREATE_DATE, false),
            getWrapper(params)
        );

        return getPageData(page, SysLogLoginDTO.class);
    }

    @Override
    public List<SysLogLoginDTO> list(Map<String, Object> params) {
        List<SysLogLoginEntity> entityList = baseDao.selectList(getWrapper(params));

        return ConvertUtils.sourceToTarget(entityList, SysLogLoginDTO.class);
    }

    private QueryWrapper<SysLogLoginEntity> getWrapper(Map<String, Object> params){
        String status = (String) params.get("status");
        String creatorName = (String) params.get("creatorName");

        QueryWrapper<SysLogLoginEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(status), "status", status);
        wrapper.like(StringUtils.isNotBlank(creatorName), "creator_name", creatorName);

        return wrapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysLogLoginEntity entity) {
        insert(entity);
    }

}