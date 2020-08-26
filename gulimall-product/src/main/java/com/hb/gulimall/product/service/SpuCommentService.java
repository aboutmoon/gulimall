package com.hb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hb.common.utils.PageUtils;
import com.hb.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-24 13:53:34
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

