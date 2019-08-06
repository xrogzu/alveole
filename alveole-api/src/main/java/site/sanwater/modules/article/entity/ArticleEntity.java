package site.sanwater.modules.article.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 文章表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_article")
public class ArticleEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 标题
     */
	private String title;
    /**
     * 内容
     */
	private String content;
    /**
     * 评论数量
     */
	private Integer reviewNum;
    /**
     * 点赞数量
     */
	private Integer thumbNum;
    /**
     * 文章类型 0为帖子，1为盖楼
     */
	private Integer articleType;
    /**
     * 禁止评论 0不禁止，1禁止
     */
	private Integer forbiddenReview;
    /**
     * 发布人头像地址
     */
	private String createUserPurl;
    /**
     * 发布人性别
     */
	private Integer createUserSex;
    /**
     * 发布人名称
     */
	private String createUserName;
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