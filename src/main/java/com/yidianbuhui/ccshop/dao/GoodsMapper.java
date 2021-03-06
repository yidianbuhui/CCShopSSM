package com.yidianbuhui.ccshop.dao;

import com.yidianbuhui.ccshop.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GoodsMapper {
    List<Goods> getGoodsList(Map<String, Object> goodsMap);

    int getCount(Map<String, Object> goodsMap);

    Goods getGoods(Integer id);

    List<Goods> getGoodsByType(Integer typeId);
}