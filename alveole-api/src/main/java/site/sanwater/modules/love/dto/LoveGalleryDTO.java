package site.sanwater.modules.love.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 情侣相册 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "情侣相册 ")
public class LoveGalleryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "LOVE_ID")
	private String loveId;

	@ApiModelProperty(value = "照片地址")
	private String phoitoUrl;

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