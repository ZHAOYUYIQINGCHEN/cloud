package com.gxy.spring.controller;

/**
 * @program: cloud2021
 * @description:
 * @author: guoxiaoying01
 * @create: 2022-01-09 15:45
 **/
import com.gxy.spring.service.PaymentFeignService;
import com.gxy.springcloud.CommonResult;
import com.gxy.springcloud.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderFeignController
{
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

}


