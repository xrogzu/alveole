package site.sanwater.modules.article.service;

import site.sanwater.common.service.CrudService;
import site.sanwater.modules.article.dto.ArticleDTO;
import site.sanwater.modules.article.entity.ArticleEntity;

/**
 * 文章表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
public interface ArticleService extends CrudService<ArticleEntity, ArticleDTO> {

}