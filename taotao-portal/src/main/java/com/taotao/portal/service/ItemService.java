package com.taotao.portal.service;

import com.taotao.pojo.TbItem;

/**
 * Created by Administrator on 2017-08-30.
 */
public interface ItemService {
    public TbItem getItemById(Long itemId);
    public String getItemDescById(Long itemId);
    public String getItemParamById(Long itemId);
}
