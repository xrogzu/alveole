package site.sanwater.modules.article.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 文章回复表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class ArticleAnswerExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "回复帖子ID")
    private String articleId;
    @Excel(name = "回复内容")
    private String content;
    @Excel(name = "回复人ID")
    private String answerId;
    @Excel(name = "回复人名称")
    private String answerName;
    @Excel(name = "回复类型 0为回复帖子1为回复回复")
    private Integer answerType;
    @Excel(name = "目标人ID")
    private String targetId;
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