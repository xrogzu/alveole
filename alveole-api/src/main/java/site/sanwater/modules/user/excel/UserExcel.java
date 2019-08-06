package site.sanwater.modules.user.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 用户表 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@Data
public class UserExcel {
    @Excel(name = "ID")
    private String id;
    @Excel(name = "用户名")
    private String name;
    @Excel(name = "密码")
    private String password;
    @Excel(name = "亲密昵称")
    private String intinacyName;
    @Excel(name = "社区昵称")
    private String communityName;
    @Excel(name = "盐")
    private String salt;
    @Excel(name = "情侣ID")
    private String loverId;
    @Excel(name = "头像地址 头像地址")
    private String titleUrl;
    @Excel(name = "性别 0女1男")
    private Integer sex;
    @Excel(name = "宣言")
    private String declaration;
    @Excel(name = "是否单身 0未单身1单身")
    private Integer isSingle;
    @Excel(name = "是否匹配过 0未匹配1匹配")
    private Integer isMatch;
    @Excel(name = "删除标识 0未删除1删除")
    private Integer delFlag;
    @Excel(name = "创建人")
    private String createdBy;
    @Excel(name = "创建时间")
    private Date createdDate;
    @Excel(name = "更新人")
    private String updatedBy;
    @Excel(name = "更新时间")
    private Date updatedDate;

}