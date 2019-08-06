package site.sanwater.modules.user.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@ApiModel(value = "用户表 ")
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "ID")
	private String id;

	@ApiModelProperty(value = "用户名")
	private String name;

	@ApiModelProperty(value = "密码")
	private String password;

	@ApiModelProperty(value = "亲密昵称")
	private String intinacyName;

	@ApiModelProperty(value = "社区昵称")
	private String communityName;

	@ApiModelProperty(value = "盐")
	private String salt;

	@ApiModelProperty(value = "情侣ID")
	private String loverId;

	@ApiModelProperty(value = "头像地址 头像地址")
	private String titleUrl;

	@ApiModelProperty(value = "性别 0女1男")
	private Integer sex;

	@ApiModelProperty(value = "宣言")
	private String declaration;

	@ApiModelProperty(value = "是否单身 0未单身1单身")
	private Integer isSingle;

	@ApiModelProperty(value = "是否匹配过 0未匹配1匹配")
	private Integer isMatch;

	@ApiModelProperty(value = "删除标识 0未删除1删除")
	private Integer delFlag;

	@ApiModelProperty(value = "创建人")
	private String createdBy;

	@ApiModelProperty(value = "创建时间")
	private Date createdDate;

	@ApiModelProperty(value = "更新人")
	private String updatedBy;

	@ApiModelProperty(value = "更新时间")
	private Date updatedDate;


}