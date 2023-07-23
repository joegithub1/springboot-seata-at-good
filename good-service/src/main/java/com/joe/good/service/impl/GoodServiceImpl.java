package com.joe.good.service.impl;

import com.joe.good.entity.Good;
import com.joe.good.mapper.GoodMapper;
import com.joe.good.service.IGoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huang
 * @since 2023-07-23
 */
@DubboService
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements IGoodService {

    @Override
    public Good findById(Long id) {
        return this.baseMapper.selectById(id);
    }

    @Override
    public int reduceStock(Long id, Long num) throws RuntimeException{
        Good good = this.baseMapper.selectById(id);
        if(good.getStock() <= num){
            throw new RuntimeException("库存不足");
        }
        if(good.getStock() - num <= 0){
            throw new RuntimeException("库存不足");
        }
        Good updGood = Good.builder().id(id).stock(good.getStock() - num).build();
        return this.baseMapper.updateById(updGood);
    }
}
