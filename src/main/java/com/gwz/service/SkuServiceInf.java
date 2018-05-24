package com.gwz.service;

import java.util.List;

import com.gwz.bean.T_MALL_PRODUCT;
import com.gwz.bean.T_MALL_SKU;
import com.gwz.bean.T_MALL_SKU_ATTR_VALUE;

public interface SkuServiceInf {

	void save_sku(T_MALL_SKU sku, List<T_MALL_SKU_ATTR_VALUE> list_attr, T_MALL_PRODUCT spu);

}
