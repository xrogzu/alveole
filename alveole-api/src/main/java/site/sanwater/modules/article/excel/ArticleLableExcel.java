package site.sanwater.modules.article.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 文章标签 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class ArticleLableExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "标签名称")
    private String name;
    @Excel(name = "标签英文名")
    private String enname;
    @Excel(name = "标签描述")
    private String descri;
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