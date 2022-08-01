package com.tuling.mall.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import com.tuling.common.utils.R;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {


    @RequestMapping("/demo01")
    public R demo01() {
        log.info("进入demo01方法");


        return R.ok().put("msg", "你好,我是order服务");
    }


}
