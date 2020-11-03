package com.yidianbuhui.ccshop.dao;

import com.yidianbuhui.ccshop.entity.Inventory;

public interface InventoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Inventory record);

    int insertSelective(Inventory record);

    Inventory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Inventory record);

    int updateByPrimaryKey(Inventory record);
}