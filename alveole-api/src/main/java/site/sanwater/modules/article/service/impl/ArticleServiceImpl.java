package site.sanwater.modules.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.article.dao.ArticleDao;
import site.sanwater.modules.article.dto.ArticleDTO;
import site.sanwater.modules.article.entity.ArticleEntity;
import site.sanwater.modules.article.service.ArticleService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 文章表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class ArticleServiceImpl extends CrudServiceImpl<ArticleDao, ArticleEntity, ArticleDTO> implements ArticleService {

    @Override
    public QueryWrapper<ArticleEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ArticleEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}