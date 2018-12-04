package com.happymall.service;

import com.github.pagehelper.PageInfo;
import com.happymall.common.ServerResponse;
import com.happymall.pojo.Shipping;

/**
 * Created by 郭江彬 on 2018/12/3 0003.
 */
public interface IShippingService {
    ServerResponse add(Integer userId, Shipping shipping);
    ServerResponse<String> del(Integer userId,Integer shippingId);
    ServerResponse update(Integer userId, Shipping shipping);
    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);
}
