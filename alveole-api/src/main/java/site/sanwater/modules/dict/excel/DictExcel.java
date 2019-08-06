package site.sanwater.modules.dict.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 字典表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class DictExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "类型")
    private String type;
    @Excel(name = "标签")
    private String label;
    @Excel(name = "描述")
    private String description;
    @Excel(name = "值")
    private String value;
    @Excel(name = "排序")
    private Integer sort;
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