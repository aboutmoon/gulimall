package com.hb.gulimall.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hb.gulimall.product.GulimallProductApplication;
import com.hb.gulimall.product.entity.BrandEntity;
import com.hb.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = GulimallProductApplication.class)
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("save successfully.");

    }

    @Test
    void getBrand(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 3L));

        list.forEach(brandEntity -> {
            System.out.println(brandEntity);
        });
    }

}
