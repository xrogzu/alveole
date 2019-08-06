package site.sanwater.modules.user.service;

import site.sanwater.common.service.CrudService;
import site.sanwater.modules.user.dto.UserDTO;
import site.sanwater.modules.user.entity.UserEntity;

/**
 * 用户表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
public interface UserService extends CrudService<UserEntity, UserDTO> {

}