package site.sanwater.modules.love.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 情侣纪念日 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class LoveMemoryExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "LOVE_ID")
    private String loveId;
    @Excel(name = "纪念标题")
    private String content;
    @Excel(name = "纪念时间")
    private Date memoryDate;
    @Excel(name = "农历公历 0农历1公历")
    private Integer lunar;
    @Excel(name = "背景地址")
    private String backUrl;
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