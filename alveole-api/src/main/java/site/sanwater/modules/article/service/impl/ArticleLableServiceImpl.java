package site.sanwater.modules.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.article.dao.ArticleLableDao;
import site.sanwater.modules.article.dto.ArticleLableDTO;
import site.sanwater.modules.article.entity.ArticleLableEntity;
import site.sanwater.modules.article.service.ArticleLableService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 文章标签 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class ArticleLableServiceImpl extends CrudServiceImpl<ArticleLableDao, ArticleLableEntity, ArticleLableDTO> implements ArticleLableService {

    @Override
    public QueryWrapper<ArticleLableEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ArticleLableEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}