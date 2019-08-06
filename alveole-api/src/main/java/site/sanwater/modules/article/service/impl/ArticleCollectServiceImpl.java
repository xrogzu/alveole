package site.sanwater.modules.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.article.dao.ArticleCollectDao;
import site.sanwater.modules.article.dto.ArticleCollectDTO;
import site.sanwater.modules.article.entity.ArticleCollectEntity;
import site.sanwater.modules.article.service.ArticleCollectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 收藏文章 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class ArticleCollectServiceImpl extends CrudServiceImpl<ArticleCollectDao, ArticleCollectEntity, ArticleCollectDTO> implements ArticleCollectService {

    @Override
    public QueryWrapper<ArticleCollectEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ArticleCollectEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}