package site.sanwater.modules.punch.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.punch.dao.PunchDao;
import site.sanwater.modules.punch.dto.PunchDTO;
import site.sanwater.modules.punch.entity.PunchEntity;
import site.sanwater.modules.punch.service.PunchService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 打卡内容 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class PunchServiceImpl extends CrudServiceImpl<PunchDao, PunchEntity, PunchDTO> implements PunchService {

    @Override
    public QueryWrapper<PunchEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PunchEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}