package site.sanwater.modules.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 另一半关联表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_user_love")
public class UserLoveEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 男孩ID
     */
	private String boyId;
    /**
     * 女孩ID
     */
	private String girlId;
    /**
     * 恋爱宣言
     */
	private String loveDescrip;
    /**
     * 恋爱分数
     */
	private Integer loveScore;
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