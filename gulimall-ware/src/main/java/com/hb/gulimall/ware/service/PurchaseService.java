package com.hb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hb.common.utils.PageUtils;
import com.hb.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-26 14:08:48
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

