package com.hc.service;

import com.hc.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public Integer create(Payment payment);
    public Payment getPaymentById(Long id);
}
