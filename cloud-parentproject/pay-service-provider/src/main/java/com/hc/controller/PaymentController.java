package com.hc.controller;

import com.hc.entity.CommonResult;
import com.hc.entity.Payment;
import com.hc.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果:"+result);   //运行日志,平时自己做的项目可以输出到控制太查看但真实项目开发上线之后软件的运行情况需要通过日志查看
        if (result>0){
            return new CommonResult<>(200,"添加成功",result);
        }else {
            return new CommonResult<>(444,"添加失败");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:"+payment);   //运行日志,平时自己做的项目可以输出到控制太查看但真实项目开发上线之后软件的运行情况需要通过日志查看
        if (payment != null){
            return new CommonResult<>(200,"查询成功",payment);
        }else {
            return new CommonResult<>(444,"找不到该记录,请确认id是否正确！");
        }
    }
}
