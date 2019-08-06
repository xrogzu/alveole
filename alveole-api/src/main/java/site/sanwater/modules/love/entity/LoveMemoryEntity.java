package site.sanwater.modules.love.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import site.sanwater.common.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 情侣纪念日 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
@EqualsAndHashCode(callSuper=false)
@TableName("sw_love_memory")
public class LoveMemoryEntity extends BaseEntity {
	private static final long serialVersionUID = 1L;

    /**
     * ID
     */
	private String id;
    /**
     * LOVE_ID
     */
	private String loveId;
    /**
     * 纪念标题
     */
	private String content;
    /**
     * 纪念时间
     */
	private Date memoryDate;
    /**
     * 农历公历 0农历1公历
     */
	private Integer lunar;
    /**
     * 背景地址
     */
	private String backUrl;
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