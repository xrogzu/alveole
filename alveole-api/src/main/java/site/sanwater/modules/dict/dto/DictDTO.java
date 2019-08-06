package site.sanwater.modules.dict.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 字典表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "字典表 ")
public class DictDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "类型")
	private String type;

	@ApiModelProperty(value = "标签")
	private String label;

	@ApiModelProperty(value = "描述")
	private String description;

	@ApiModelProperty(value = "值")
	private String value;

	@ApiModelProperty(value = "排序")
	private Integer sort;

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