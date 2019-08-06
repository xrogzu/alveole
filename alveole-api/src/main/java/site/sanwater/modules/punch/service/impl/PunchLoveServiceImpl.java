package site.sanwater.modules.punch.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.punch.dao.PunchLoveDao;
import site.sanwater.modules.punch.dto.PunchLoveDTO;
import site.sanwater.modules.punch.entity.PunchLoveEntity;
import site.sanwater.modules.punch.service.PunchLoveService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 情侣打卡 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class PunchLoveServiceImpl extends CrudServiceImpl<PunchLoveDao, PunchLoveEntity, PunchLoveDTO> implements PunchLoveService {

    @Override
    public QueryWrapper<PunchLoveEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PunchLoveEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}