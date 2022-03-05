package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.OrderModel;

public interface OrderService {
    //****1.通过前端前端url上传过的活动id，然后下单接口校验对应id是否属于对应商品且活动已开始*******
    //2.直接在下单接口内判断对应商品是否存在秒杀活动，若存在正在秒杀活动中的商品则以秒杀价格下单
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}
