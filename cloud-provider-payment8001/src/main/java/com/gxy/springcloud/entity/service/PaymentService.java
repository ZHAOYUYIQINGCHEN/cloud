package com.gxy.springcloud.entity.service;


import com.gxy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

