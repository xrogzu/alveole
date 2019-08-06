package site.sanwater.modules.love.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 情侣相册 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class LoveGalleryExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "LOVE_ID")
    private String loveId;
    @Excel(name = "照片地址")
    private String phoitoUrl;
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