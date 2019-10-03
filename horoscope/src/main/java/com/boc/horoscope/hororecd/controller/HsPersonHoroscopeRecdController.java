package com.boc.horoscope.hororecd.controller;

import com.boc.common.result.ResultBean;
import com.boc.horoscope.hororecd.service.HsPersonHoroscopeRecdService;
import com.boc.horoscope.horos.po.HsPersonHoroscopeRecd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/horoscopeRecd")
public class HsPersonHoroscopeRecdController {

    @Autowired
    private HsPersonHoroscopeRecdService hsPersonHoroscopeRecdService;

    @PostMapping("/insert")
    public ResultBean insert(@RequestBody HsPersonHoroscopeRecd hsPersonHoroscopeRecd){
        hsPersonHoroscopeRecdService.inserHoroRecd(hsPersonHoroscopeRecd);
        return ResultBean.builder().code(0).message("插入成功").build();
    }
}
