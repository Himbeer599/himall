package com.shop.himall.product.dao;

import com.shop.himall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author itnan
 * @email dtuznn@gmail.com
 * @date 2024-12-13 20:59:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
