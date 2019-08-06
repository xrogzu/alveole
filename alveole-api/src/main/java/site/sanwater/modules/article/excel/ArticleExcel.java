package site.sanwater.modules.article.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 文章表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class ArticleExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "标题")
    private String title;
    @Excel(name = "内容")
    private String content;
    @Excel(name = "评论数量")
    private Integer reviewNum;
    @Excel(name = "点赞数量")
    private Integer thumbNum;
    @Excel(name = "文章类型 0为帖子，1为盖楼")
    private Integer articleType;
    @Excel(name = "禁止评论 0不禁止，1禁止")
    private Integer forbiddenReview;
    @Excel(name = "发布人头像地址")
    private String createUserPurl;
    @Excel(name = "发布人性别")
    private Integer createUserSex;
    @Excel(name = "发布人名称")
    private String createUserName;
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