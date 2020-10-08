package com.endurance.apac.referral.dao;

import com.endurance.apac.referral.model.ReferralCoupon;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ReferralCouponDao {
    private Map<String, ReferralCoupon> DB = new HashMap<>();

    public ReferralCoupon getCouponByCode(String code){
        return DB.get(code);
    }

    public Map<String, ReferralCoupon> getAllCoupons(){
        return DB;
    }

    public Boolean addReferralCoupon(ReferralCoupon referralCoupon){
        DB.put(referralCoupon.getCode(), referralCoupon);
        return Boolean.TRUE;
    }
}
