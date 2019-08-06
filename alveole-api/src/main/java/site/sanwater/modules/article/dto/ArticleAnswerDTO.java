package site.sanwater.modules.article.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 文章回复表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "文章回复表 ")
public class ArticleAnswerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "回复帖子ID")
	private String articleId;

	@ApiModelProperty(value = "回复内容")
	private String content;

	@ApiModelProperty(value = "回复人ID")
	private String answerId;

	@ApiModelProperty(value = "回复人名称")
	private String answerName;

	@ApiModelProperty(value = "回复类型 0为回复帖子1为回复回复")
	private Integer answerType;

	@ApiModelProperty(value = "目标人ID")
	private String targetId;

	@ApiModelProperty(value = "删除标识 0未删除1删除")
	private Integer delFlag;

	@ApiModelProperty(value = "创建人")
	private String createBy;

	@ApiModelProperty(value = "创建时间")
	private Date createDate;

	@ApiModelProperty(value = "更新人")
	private String updateBy;

	@ApiModelProperty(value = "更新时间")
	private Date updateDate;


}