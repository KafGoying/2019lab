package com.lykj.springcloud.service.impl;

import org.springframework.stereotype.Service;
import com.lykj.springcloud.data.entities.Payment;
import com.lykj.springcloud.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentDaoMapper;

    @Override
    public int create(Payment payment) {
        return paymentDaoMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDaoMapper.selectByPrimaryKey(id);
    }
}
