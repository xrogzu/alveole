package site.sanwater.modules.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import site.sanwater.common.service.impl.CrudServiceImpl;
import site.sanwater.modules.article.dao.ArticleAnswerDao;
import site.sanwater.modules.article.dto.ArticleAnswerDTO;
import site.sanwater.modules.article.entity.ArticleAnswerEntity;
import site.sanwater.modules.article.service.ArticleAnswerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 文章回复表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Service
public class ArticleAnswerServiceImpl extends CrudServiceImpl<ArticleAnswerDao, ArticleAnswerEntity, ArticleAnswerDTO> implements ArticleAnswerService {

    @Override
    public QueryWrapper<ArticleAnswerEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<ArticleAnswerEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}