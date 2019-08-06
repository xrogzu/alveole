package site.sanwater.modules.article.dao;

import site.sanwater.common.dao.BaseDao;
import site.sanwater.modules.article.entity.ArticleLableEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章标签 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Mapper
public interface ArticleLableDao extends BaseDao<ArticleLableEntity> {
	
}