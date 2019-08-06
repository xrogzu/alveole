package site.sanwater.modules.punch.controller;

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
import site.sanwater.modules.punch.dto.PunchDTO;
import site.sanwater.modules.punch.excel.PunchExcel;
import site.sanwater.modules.punch.service.PunchService;
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
 * 打卡内容 
 *
 * @author PPS 309833177@qq.com
 * @since 1.0.0 2019-08-06
 */
@RestController
@RequestMapping("punch/punch")
@Api(tags="打卡内容 ")
public class PunchController {
    @Autowired
    private PunchService punchService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @RequiresPermissions("punch:punch:page")
    public Result<PageData<PunchDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<PunchDTO> page = punchService.page(params);

        return new Result<PageData<PunchDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @RequiresPermissions("punch:punch:info")
    public Result<PunchDTO> get(@PathVariable("id") Long id){
        PunchDTO data = punchService.get(id);

        return new Result<PunchDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @RequiresPermissions("punch:punch:save")
    public Result save(@RequestBody PunchDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        punchService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @RequiresPermissions("punch:punch:update")
    public Result update(@RequestBody PunchDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        punchService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @RequiresPermissions("punch:punch:delete")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        punchService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @RequiresPermissions("punch:punch:export")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<PunchDTO> list = punchService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, list, PunchExcel.class);
    }

}