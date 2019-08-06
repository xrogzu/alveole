package site.sanwater.modules.article.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 文章回复表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_article_answer")
public class ArticleAnswerEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 回复帖子ID
     */
	private String articleId;
    /**
     * 回复内容
     */
	private String content;
    /**
     * 回复人ID
     */
	private String answerId;
    /**
     * 回复人名称
     */
	private String answerName;
    /**
     * 回复类型 0为回复帖子1为回复回复
     */
	private Integer answerType;
    /**
     * 目标人ID
     */
	private String targetId;
    /**
     * 删除标识 0未删除1删除
     */
	private Integer delFlag;
    /**
     * 创建人
     */
	private String createBy;
    /**
     * 创建时间
     */
	private Date createDate;
    /**
     * 更新人
     */
	private String updateBy;
    /**
     * 更新时间
     */
	private Date updateDate;
}