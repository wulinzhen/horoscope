package com.boc.horoscope.platoon.controller;

import com.boc.common.result.ResultBean;
import com.boc.horoscope.horos.po.HsEightDiagrams;
import com.boc.horoscope.platoon.service.HsEightDiagramsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hsEightDiagrams")
@Api(value = "/hsEightDiagrams",tags = "八卦信息服务")
public class HsEightDiagramsController {

    private Logger logger = LoggerFactory.getLogger(HsEightDiagramsController.class);

    @Autowired
    private HsEightDiagramsService hsEightDiagramsService;
    @ResponseBody
    @ApiOperation(value="获取八卦信息", notes="根据id来获八卦信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "八卦id", required = true, dataType = "Integer", paramType = "path")
            })
    @RequestMapping(value = "/select/{id}",method = RequestMethod.GET)
    ResultBean<HsEightDiagrams> selectHsEightDiagramsById(@PathVariable("id") Integer id){
        logger.info("selectHsEightDiagramsById");
        HsEightDiagrams hsEightDiagrams = hsEightDiagramsService.selectHsEightDiagramsById(id);
        ResultBean<HsEightDiagrams> resultBean = new ResultBean<>();
        resultBean.setData(hsEightDiagrams);
        return resultBean;
    }
}
