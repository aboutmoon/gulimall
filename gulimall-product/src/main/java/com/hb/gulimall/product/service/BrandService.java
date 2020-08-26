package com.hb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hb.common.utils.PageUtils;
import com.hb.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-24 13:53:34
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

