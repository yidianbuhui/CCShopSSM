package com.yidianbuhui.ccshop.dao;

import com.yidianbuhui.ccshop.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsTypeMapper {
    List<GoodsType> getGoodsTypeList(Map<String, Object> goodsTypeMap);

    int getCount(Map<String, Object> goodsTypeMap);

    GoodsType getGoodsType(Integer id);

}