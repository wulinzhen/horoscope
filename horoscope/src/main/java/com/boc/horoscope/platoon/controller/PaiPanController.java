package com.boc.horoscope.platoon.controller;

import com.boc.common.result.ResultBean;
import com.boc.horoscope.horos.po.CnRegionInfo;
import com.boc.horoscope.paipan.dto.PaipanDTO;
import com.boc.horoscope.paipan.dto.PaipanRunDTO;
import com.boc.horoscope.platoon.service.CnRegionInfoService;
import com.boc.horoscope.platoon.service.PaiPanService;
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
@RequestMapping("/paiPan")
@Api(value = "/paiPan",tags = "八字排盘服务")
public class PaiPanController {

    private Logger logger = LoggerFactory.getLogger(RegionInfoController.class);

    @Autowired
    private PaiPanService paiPanService;

    @ResponseBody
    @ApiOperation(value="八字排盘服务", notes="八字排盘服务")
    @RequestMapping(value = "/paiPan",method = RequestMethod.POST)
    ResultBean paiPan(@RequestBody PaipanDTO paipanDTO){
        logger.info("八字排盘服务:{}",paipanDTO);
        PaipanRunDTO paipanRunDTO = paiPanService.paiPan(paipanDTO);
        ResultBean resultBean = new ResultBean<>();
        resultBean.setData(paipanRunDTO);
        return resultBean;
    }
}
