package com.shop.himall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.common.utils.PageUtils;
import com.shop.himall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author itnan
 * @email dtuznn@gmail.com
 * @date 2024-12-13 20:59:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

