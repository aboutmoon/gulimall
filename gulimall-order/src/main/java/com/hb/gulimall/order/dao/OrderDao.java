package com.hb.gulimall.order.dao;

import com.hb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-26 13:55:51
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
