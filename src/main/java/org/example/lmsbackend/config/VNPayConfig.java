package org.example.lmsbackend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VNPayConfig {
    
    // VNPay Configuration
    @Value("${vnpay.tmnCode:}")
    private String vnp_TmnCode;
    
    @Value("${vnpay.hashSecret:}")
    private String vnp_HashSecret;
    
    @Value("${vnpay.payUrl:https://sandbox.vnpayment.vn/paymentv2/vpcpay.html}")
    private String vnp_PayUrl;
    
    @Value("${vnpay.returnUrl:http://localhost:4200/courses}")
    private String vnp_ReturnUrl;
    
    @Value("${vnpay.apiUrl:https://sandbox.vnpayment.vn/merchant_webapi/api/transaction}")
    private String vnp_ApiUrl;
    
    // Getters
    public String getVnp_TmnCode() {
        return vnp_TmnCode;
    }
    
    public String getVnp_HashSecret() {
        return vnp_HashSecret;
    }
    
    public String getVnp_PayUrl() {
        return vnp_PayUrl;
    }
    
    public String getVnp_ReturnUrl() {
        return vnp_ReturnUrl;
    }
    
    public String getVnp_ApiUrl() {
        return vnp_ApiUrl;
    }
}
