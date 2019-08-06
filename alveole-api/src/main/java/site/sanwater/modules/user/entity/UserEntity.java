package site.sanwater.modules.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 用户表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_user")
public class UserEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 用户名
     */
	private String name;
    /**
     * 密码
     */
	private String password;
    /**
     * 亲密昵称
     */
	private String intinacyName;
    /**
     * 社区昵称
     */
	private String communityName;
    /**
     * 盐
     */
	private String salt;
    /**
     * 情侣ID
     */
	private String loverId;
    /**
     * 头像地址 头像地址
     */
	private String titleUrl;
    /**
     * 性别 0女1男
     */
	private Integer sex;
    /**
     * 宣言
     */
	private String declaration;
    /**
     * 是否单身 0未单身1单身
     */
	private Integer isSingle;
    /**
     * 是否匹配过 0未匹配1匹配
     */
	private Integer isMatch;
    /**
     * 删除标识 0未删除1删除
     */
	private Integer delFlag;
    /**
     * 创建人
     */
	private String createdBy;
    /**
     * 创建时间
     */
	private Date createdDate;
    /**
     * 更新人
     */
	private String updatedBy;
    /**
     * 更新时间
     */
	private Date updatedDate;
}