package site.sanwater.modules.article.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 文章表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "文章表 ")
public class ArticleDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "标题")
	private String title;

	@ApiModelProperty(value = "内容")
	private String content;

	@ApiModelProperty(value = "评论数量")
	private Integer reviewNum;

	@ApiModelProperty(value = "点赞数量")
	private Integer thumbNum;

	@ApiModelProperty(value = "文章类型 0为帖子，1为盖楼")
	private Integer articleType;

	@ApiModelProperty(value = "禁止评论 0不禁止，1禁止")
	private Integer forbiddenReview;

	@ApiModelProperty(value = "发布人头像地址")
	private String createUserPurl;

	@ApiModelProperty(value = "发布人性别")
	private Integer createUserSex;

	@ApiModelProperty(value = "发布人名称")
	private String createUserName;

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