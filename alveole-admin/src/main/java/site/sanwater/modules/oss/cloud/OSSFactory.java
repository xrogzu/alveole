/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package site.sanwater.modules.oss.cloud;

import site.sanwater.common.constant.Constant;
import site.sanwater.common.utils.SpringContextUtils;
import site.sanwater.modules.sys.service.SysParamsService;

/**
 * 文件上传Factory
 * @author Mark sunlightcs@gmail.com
 */
public final class OSSFactory {
    private static SysParamsService sysParamsService;

    static {
        OSSFactory.sysParamsService = SpringContextUtils.getBean(SysParamsService.class);
    }

    public static AbstractCloudStorageService build(){
        //获取云存储配置信息
        CloudStorageConfig config = sysParamsService.getValueObject(Constant.CLOUD_STORAGE_CONFIG_KEY, CloudStorageConfig.class);

        if(config.getType() == Constant.CloudService.QINIU.getValue()){
            return new QiniuCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.ALIYUN.getValue()){
            return new AliyunCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.QCLOUD.getValue()){
            return new QcloudCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.FASTDFS.getValue()){
            return new FastDFSCloudStorageService(config);
        }else if(config.getType() == Constant.CloudService.LOCAL.getValue()){
            return new LocalCloudStorageService(config);
        }

        return null;
    }

}