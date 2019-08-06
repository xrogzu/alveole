package site.sanwater.modules.article.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 文章标签 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "文章标签 ")
public class ArticleLableDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "标签名称")
	private String name;

	@ApiModelProperty(value = "标签英文名")
	private String enname;

	@ApiModelProperty(value = "标签描述")
	private String descri;

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