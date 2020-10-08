package com.endurance.apac.referral.controller;

import com.endurance.apac.referral.model.ReferralCoupon;
import com.endurance.apac.referral.service.ReferralCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("api/referralCoupon")
@RestController
public class ReferralCouponController {

    private final ReferralCouponService referralCouponService;

    @Autowired
    public ReferralCouponController(ReferralCouponService referralCouponService) {
        this.referralCouponService = referralCouponService;
    }

    @GetMapping(path = "{code}")
    public ReferralCoupon getReferralCouponByCode(@PathVariable("code") String code){
        return referralCouponService.getReferralCouponByCode(code);
    }

    @GetMapping
    public Map<String, ReferralCoupon> getAllCoupons(){
        return referralCouponService.getAllCoupons();
    }

    @PostMapping
    public Boolean addReferralCoupon(@RequestBody ReferralCoupon referralCoupon){
        return referralCouponService.addReferralCoupon(referralCoupon);
    }

    @PutMapping(path = "{code}")
    public Boolean updateReferralCoupon(@PathVariable("code") String code){
        return Boolean.TRUE;
    }

    @DeleteMapping(path = "{code}")
    public Boolean deleteReferralCoupon(@PathVariable("code") String code){
        return Boolean.TRUE;
    }
}
