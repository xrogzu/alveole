/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.message.service;

import site.sanwater.common.service.CrudService;
import site.sanwater.modules.message.dto.SysMailTemplateDTO;
import site.sanwater.modules.message.entity.SysMailTemplateEntity;

/**
 * 邮件模板
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysMailTemplateService extends CrudService<SysMailTemplateEntity, SysMailTemplateDTO> {

    /**
     * 发送邮件
     * @param id           邮件模板ID
     * @param mailTo       收件人
     * @param mailCc       抄送
     * @param params       模板参数
     */
    boolean sendMail(Long id, String mailTo, String mailCc, String params) throws Exception;
}