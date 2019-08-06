package site.sanwater.modules.article.controller;

import site.sanwater.common.annotation.LogOperation;
import site.sanwater.common.constant.Constant;
import site.sanwater.common.page.PageData;
import site.sanwater.common.utils.ExcelUtils;
import site.sanwater.common.utils.Result;
import site.sanwater.common.validator.AssertUtils;
import site.sanwater.common.validator.ValidatorUtils;
import site.sanwater.common.validator.group.AddGroup;
import site.sanwater.common.validator.group.DefaultGroup;
import site.sanwater.common.validator.group.UpdateGroup;
import site.sanwater.modules.article.dto.ArticleLableDTO;
import site.sanwater.modules.article.excel.ArticleLableExcel;
import site.sanwater.modules.article.service.ArticleLableService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
 * 文章标签 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@RestController
@RequestMapping("article/articlelable")
@Api(tags="文章标签 ")
public class ArticleLableController {
    @Autowired
    private ArticleLableService articleLableService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("article:articlelable:page")
    public Result<PageData<ArticleLableDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<ArticleLableDTO> page = articleLableService.page(params);

        return new Result<PageData<ArticleLableDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("article:articlelable:info")
    public Result<ArticleLableDTO> get(@PathVariable("id") Long id){
        ArticleLableDTO data = articleLableService.get(id);

        return new Result<ArticleLableDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("article:articlelable:save")
    public Result save(@RequestBody ArticleLableDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        articleLableService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("article:articlelable:update")
    public Result update(@RequestBody ArticleLableDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        articleLableService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("article:articlelable:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        articleLableService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("article:articlelable:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<ArticleLableDTO> list = articleLableService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, ArticleLableExcel.class);
    }

}