package site.sanwater.modules.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.love.dao.LoveDiaryDao;
import site.sanwater.modules.love.dto.LoveDiaryDTO;
import site.sanwater.modules.love.entity.LoveDiaryEntity;
import site.sanwater.modules.love.service.LoveDiaryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 情侣日记 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class LoveDiaryServiceImpl extends CrudServiceImpl<LoveDiaryDao, LoveDiaryEntity, LoveDiaryDTO> implements LoveDiaryService {

    @Override
    public QueryWrapper<LoveDiaryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<LoveDiaryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}