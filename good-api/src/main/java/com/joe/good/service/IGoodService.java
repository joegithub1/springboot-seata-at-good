package com.joe.good.service;

import com.joe.good.entity.Good;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
public interface IGoodService extends IService<Good> {

    Good findById(Long id);

    //减库存
    int reduceStock(Long id,Long num) throws RuntimeException;
}
