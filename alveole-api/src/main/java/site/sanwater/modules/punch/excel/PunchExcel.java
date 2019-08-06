package site.sanwater.modules.punch.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 打卡内容 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class PunchExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "打卡内容")
    private String content;
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