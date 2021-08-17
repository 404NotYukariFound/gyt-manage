package com.eight.gytManage.controller.resource;

import com.eight.gytManage.page.Page;
import com.eight.gytManage.pojo.Tb_natmeha_signal_source;
import com.eight.gytManage.service.IResourceService;
import com.eight.gytManage.utils.ResultMapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @Author Kele-Bing
 * @Create 2021/8/16 11:14
 * @Version 1.0
 */
@Controller
@RequestMapping("/eight")
public class ResourceController {
    @Autowired
    private IResourceService resourceService;
    
    @RequestMapping("querySignalSourceList")
    @ResponseBody
    public HashMap<String,Object> querySignalSourceList(){
        return ResultMapUtils.singleResult(resourceService.querySignalSourceList());
    }

    @RequestMapping("querySignalSourcePage")
    @ResponseBody
    public HashMap<String,Object> querySignalSourcePage(@RequestParam(value = "num",defaultValue = "1") int currentNum, @RequestParam(value = "pageSize", defaultValue = "10") int singlePageSize, String param){
        return ResultMapUtils.singleResult(resourceService.querySignalSourcePage(currentNum,singlePageSize,param));
    }


    @RequestMapping("deleteSignalSourcePage")
    @ResponseBody
    public HashMap<String,Object> deleteSignalSourcePage(Tb_natmeha_signal_source source){
        int i = resourceService.deleteSignalSourcePage(source);
        return ResultMapUtils.operateResult(i);
    }

    @RequestMapping("updateSignalSourcePage")
    @ResponseBody
    public HashMap<String,Object> updateSignalSourcePage(Tb_natmeha_signal_source source){
        int i = resourceService.updateSignalSourcePage(source);
        return ResultMapUtils.operateResult(i);
    }
    
}
