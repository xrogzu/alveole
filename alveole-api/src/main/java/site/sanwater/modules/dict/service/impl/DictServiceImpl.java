package site.sanwater.modules.dict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.dict.dao.DictDao;
import site.sanwater.modules.dict.dto.DictDTO;
import site.sanwater.modules.dict.entity.DictEntity;
import site.sanwater.modules.dict.service.DictService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 字典表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class DictServiceImpl extends CrudServiceImpl<DictDao, DictEntity, DictDTO> implements DictService {

    @Override
    public QueryWrapper<DictEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<DictEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}