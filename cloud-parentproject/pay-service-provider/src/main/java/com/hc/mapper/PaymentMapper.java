package com.hc.mapper;

import com.hc.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    public Integer create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
