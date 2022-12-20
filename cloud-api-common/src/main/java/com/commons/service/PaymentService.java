package com.commons.service;

import com.commons.entity.Payment;

public interface PaymentService {
    public Integer create(Payment payment);
    public Payment getPaymentById(Long id);
}
