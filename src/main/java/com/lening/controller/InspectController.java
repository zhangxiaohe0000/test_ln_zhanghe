package com.lening.controller;

import com.lening.entity.Inspect;
import com.lening.service.InspectService;
import com.lening.utils.ResultInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/inspect")
public class InspectController {

    @Resource
    private InspectService inspectService;

    @RequestMapping("/findOrderList")
    public List<Inspect> findOrderList(@RequestBody(required = false) Inspect orderEntity) {
        return inspectService.findOrderList(orderEntity);
    }

    @RequestMapping("/findOtime")
    public List<Inspect> findOtime() {
        return inspectService.findOtime();
    }

    @RequestMapping("/findTimesection")
    public List<Inspect> findTimesection() {
        return inspectService.findTimesection();
    }

    @RequestMapping("/findSetmeal")
    public List<Inspect> findSetmeal() {
        return inspectService.findSetmeal();
    }

    @RequestMapping("/insertOrderandUser")
    public ResultInfo insertOrderandUser(@RequestBody Inspect inspect) {
        try{
            inspectService.insertOrderAndUser(inspect);
            return new ResultInfo(true,"预约成功");
        }catch (Exception e){
            return new ResultInfo(false,"预约失败");
        }
    }

}
