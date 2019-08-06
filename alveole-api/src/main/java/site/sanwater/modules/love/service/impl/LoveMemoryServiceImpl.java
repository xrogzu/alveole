package site.sanwater.modules.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.love.dao.LoveMemoryDao;
import site.sanwater.modules.love.dto.LoveMemoryDTO;
import site.sanwater.modules.love.entity.LoveMemoryEntity;
import site.sanwater.modules.love.service.LoveMemoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 情侣纪念日 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class LoveMemoryServiceImpl extends CrudServiceImpl<LoveMemoryDao, LoveMemoryEntity, LoveMemoryDTO> implements LoveMemoryService {

    @Override
    public QueryWrapper<LoveMemoryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<LoveMemoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}