package com.shop.himall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.himall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author itnan
 * @email dtuznn@gmail.com
 * @date 2024-12-13 20:59:44
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

