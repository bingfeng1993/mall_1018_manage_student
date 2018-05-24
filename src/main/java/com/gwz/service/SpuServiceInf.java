package com.gwz.service;

import java.util.List;

import com.gwz.bean.T_MALL_PRODUCT;

public interface SpuServiceInf {

	public void save_spu(T_MALL_PRODUCT spu, List<String> list_image);

	public List<T_MALL_PRODUCT> get_spu_list(int pp_id, int flbh2);

}
