package site.sanwater.modules.user.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 另一半关联表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class UserLoveExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "男孩ID")
    private String boyId;
    @Excel(name = "女孩ID")
    private String girlId;
    @Excel(name = "恋爱宣言")
    private String loveDescrip;
    @Excel(name = "恋爱分数")
    private Integer loveScore;
    @Excel(name = "删除标识 0未删除1删除")
    private Integer delFlag;
    @Excel(name = "创建人")
    private String createBy;
    @Excel(name = "创建时间")
    private Date createDate;
    @Excel(name = "更新人")
    private String updateBy;
    @Excel(name = "更新时间")
    private Date updateDate;

}