package com.boc.horoscope.platoon.controller;

import com.boc.common.result.ResultBean;
import com.boc.horoscope.horos.po.CnRegionInfo;
import com.boc.horoscope.horos.po.HsEightDiagrams;
import com.boc.horoscope.platoon.service.CnRegionInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/regionInfo")
@Api(value = "/regionInfo",tags = "省市编码服务")
public class RegionInfoController {

    private Logger logger = LoggerFactory.getLogger(RegionInfoController.class);

    @Autowired
    private CnRegionInfoService cnRegionInfoService;

    @ResponseBody
    @ApiOperation(value="获取省市编码", notes="获取省市编码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "superiorCode", value = "上级编码", required = true, dataType = "String", paramType = "path")
    })
    @RequestMapping(value = "/select/{superiorCode}",method = RequestMethod.GET)
    ResultBean selectRegionBySuperiorCode(@PathVariable("superiorCode") String superiorCode){
        logger.info("获取省市编码:{}",superiorCode);
        List<CnRegionInfo> regionInfos = cnRegionInfoService.selectBySuperCriCode(superiorCode);
        ResultBean resultBean = new ResultBean<>();
        resultBean.setData(regionInfos);
        return resultBean;
    }
}
