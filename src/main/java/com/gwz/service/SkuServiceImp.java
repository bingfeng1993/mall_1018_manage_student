package com.gwz.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gwz.bean.T_MALL_PRODUCT;
import com.gwz.bean.T_MALL_SKU;
import com.gwz.bean.T_MALL_SKU_ATTR_VALUE;
import com.gwz.mapper.SkuMapper;

@Service
public class SkuServiceImp implements SkuServiceInf {
	
	@Autowired 
	SkuMapper skuMapper;

	@Override
	public void save_sku(T_MALL_SKU sku, List<T_MALL_SKU_ATTR_VALUE> list_attr, T_MALL_PRODUCT spu) {

		//保存sku表，返回sku主键
		sku.setShp_id(spu.getId());
		skuMapper.insert_sku(sku);
		
		//根据sku主键批量保存属性关联表
		Map<Object, Object> map = new HashMap<>();
		map.put("shp_id", spu.getId());
		map.put("skp_id", sku.getId());
		map.put("list_av", list_attr);
		skuMapper.insert_sku_av(map);
	}

}
