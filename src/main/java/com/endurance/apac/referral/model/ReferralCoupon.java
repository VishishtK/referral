package com.endurance.apac.referral.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class ReferralCoupon {

    enum ReferralCouponStatus{
        ACTIVE,
        SUSPENDED,
        DELETED
    }

    private UUID uuid;
    private String resellerID;
    private String customerID;
    private String code;
    private Integer usageCount;
    private ReferralCouponStatus status;

    public ReferralCoupon(@JsonProperty("resellerID") String resellerID,
                          @JsonProperty("customerID") String customerID) {
        this.uuid = UUID.randomUUID();
        this.code = createRandomCode(10);
        this.resellerID = resellerID;
        this.customerID = customerID;
        this.usageCount = 0;
        this.status = ReferralCouponStatus.ACTIVE;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getResellerID() {
        return resellerID;
    }

    public void setResellerID(String resellerID) {
        this.resellerID = resellerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public ReferralCouponStatus getStatus() {
        return status;
    }

    public void setStatus(ReferralCouponStatus status) {
        this.status = status;
    }

    public String createRandomCode(int codeLength){
        char[] chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new SecureRandom();
        for (int i = 0; i < codeLength; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();
        System.out.println(output);
        return output ;
    }
}
