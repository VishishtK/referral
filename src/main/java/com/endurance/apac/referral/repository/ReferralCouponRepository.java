package com.endurance.apac.referral.repository;

import com.endurance.apac.referral.dao.ReferralCouponDao;
import com.endurance.apac.referral.model.ReferralCoupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class ReferralCouponRepository {

    private final ReferralCouponDao referralCouponDao;

    @Autowired
    public ReferralCouponRepository(ReferralCouponDao referralCouponDao) {
        this.referralCouponDao = referralCouponDao;
    }

    public Boolean addReferralCoupon(ReferralCoupon referralCoupon){
        return referralCouponDao.addReferralCoupon(referralCoupon);
    }

    public Map<String, ReferralCoupon> getAllCoupons(){
        return referralCouponDao.getAllCoupons();
    }

    public ReferralCoupon getCouponByCode(String code){
        return referralCouponDao.getCouponByCode(code);
    }
}
