/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.message.service;

import site.sanwater.common.page.PageData;
import site.sanwater.common.service.BaseService;
import site.sanwater.modules.message.dto.SysSmsDTO;
import site.sanwater.modules.message.entity.SysSmsEntity;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 短信
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysSmsService extends BaseService<SysSmsEntity> {

    PageData<SysSmsDTO> page(Map<String, Object> params);

    /**
     * 发送短信
     * @param mobile   手机号
     * @param params   短信参数
     */
    void send(String mobile, String params);

    /**
     * 保存短信发送记录
     * @param platform   平台
     * @param mobile   手机号
     * @param params   短信参数
     * @param status   发送状态
     */
    void save(Integer platform, String mobile, LinkedHashMap<String, String> params, Integer status);
}

