package site.sanwater.modules.punch.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 打卡内容 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_punch")
public class PunchEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * 打卡内容
     */
	private String content;
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