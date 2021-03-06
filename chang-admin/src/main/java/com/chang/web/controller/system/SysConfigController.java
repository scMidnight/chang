package com.chang.web.controller.system;

import com.chang.common.core.controller.BaseController;
import com.chang.common.core.page.TableDataInfo;
import com.chang.system.domain.SysConfig;
import com.chang.system.service.ISysConfigService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author: SunChang
 * @Date: 2019/8/2 16:05
 * @Description: 参数配置 信息操作处理
 */
@Controller
@RequestMapping("/system/config")
public class SysConfigController extends BaseController {

    private String prefix = "system/config";

    @Autowired
    private ISysConfigService configService;

    //@RequiresPermissions("system:config:list")
    @GetMapping()
    public String config() {
        return prefix + "/config";
    }

    @RequestMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysConfig config) {
        startPage();
        List<SysConfig> list = configService.selectConfigList(config);
        return getDataTable(list);
    }

}
