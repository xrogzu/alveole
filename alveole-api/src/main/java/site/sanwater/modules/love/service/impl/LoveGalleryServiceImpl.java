package site.sanwater.modules.love.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.love.dao.LoveGalleryDao;
import site.sanwater.modules.love.dto.LoveGalleryDTO;
import site.sanwater.modules.love.entity.LoveGalleryEntity;
import site.sanwater.modules.love.service.LoveGalleryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 情侣相册 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class LoveGalleryServiceImpl extends CrudServiceImpl<LoveGalleryDao, LoveGalleryEntity, LoveGalleryDTO> implements LoveGalleryService {

    @Override
    public QueryWrapper<LoveGalleryEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<LoveGalleryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}