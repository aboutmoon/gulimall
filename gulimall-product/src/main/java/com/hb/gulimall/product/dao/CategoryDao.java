package com.hb.gulimall.product.dao;

import com.hb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hb
 * @email akaisola@icloud.com
 * @date 2020-08-24 13:53:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
