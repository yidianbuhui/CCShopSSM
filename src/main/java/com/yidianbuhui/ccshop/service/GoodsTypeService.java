package com.yidianbuhui.ccshop.service;

import com.yidianbuhui.ccshop.entity.GoodsType;

import java.util.List;
import java.util.Map;

public interface GoodsTypeService {
    List<GoodsType> getGoodsTypeList(Map<String, Object> goodsTypeMap);

    int getCount(Map<String, Object> goodsTypeMap);

    GoodsType getGoodsType(Integer id);

}
