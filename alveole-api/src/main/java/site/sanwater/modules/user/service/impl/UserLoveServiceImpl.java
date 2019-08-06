package site.sanwater.modules.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.user.dao.UserLoveDao;
import site.sanwater.modules.user.dto.UserLoveDTO;
import site.sanwater.modules.user.entity.UserLoveEntity;
import site.sanwater.modules.user.service.UserLoveService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 另一半关联表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class UserLoveServiceImpl extends CrudServiceImpl<UserLoveDao, UserLoveEntity, UserLoveDTO> implements UserLoveService {

    @Override
    public QueryWrapper<UserLoveEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<UserLoveEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}