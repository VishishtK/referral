package com.endurance.apac.referral.service;

import com.endurance.apac.referral.model.ReferralCoupon;
import com.endurance.apac.referral.repository.ReferralCouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ReferralCouponService {

    private final ReferralCouponRepository referralCouponRepository;

    @Autowired
    public ReferralCouponService(ReferralCouponRepository referralCouponRepository) {
        this.referralCouponRepository = referralCouponRepository;
    }

    public Boolean addReferralCoupon(ReferralCoupon referralCoupon){
        return referralCouponRepository.addReferralCoupon(referralCoupon);
    }

    public ReferralCoupon getReferralCouponByCode(String code){
        return referralCouponRepository.getCouponByCode(code);
    }

    public Map<String, ReferralCoupon> getAllCoupons(){
        return referralCouponRepository.getAllCoupons();
    }

    public Boolean increaseUsage(String code){
        ReferralCoupon coupon = referralCouponRepository.getCouponByCode(code);
        coupon.setUsageCount(coupon.getUsageCount() + 1);
        referralCouponRepository.addReferralCoupon(coupon);
        return Boolean.TRUE;
    }
}
