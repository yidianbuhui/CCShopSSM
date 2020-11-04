package com.yidianbuhui.ccshop.service.impl;

import com.yidianbuhui.ccshop.dao.GoodsTypeMapper;
import com.yidianbuhui.ccshop.entity.GoodsType;
import com.yidianbuhui.ccshop.service.GoodsTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {
    @Resource
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public List<GoodsType> getGoodsTypeList(Map<String,Object> goodsTypeMap) {
        return goodsTypeMapper.getGoodsTypeList(goodsTypeMap);
    }

    @Override
    public int getCount(Map<String, Object> goodsTypeMap) {
        return goodsTypeMapper.getCount(goodsTypeMap);
    }

    @Override
    public GoodsType getGoodsType(Integer id) {
        return goodsTypeMapper.getGoodsType(id);
    }

}
