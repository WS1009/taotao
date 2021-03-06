package com.taotao.portal.service;

import com.taotao.common.pojo.TaotaoResult;
import com.taotao.portal.pojo.CartItem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017-09-01.
 */
public interface CartService {
    public TaotaoResult addCart(Long itemId, Integer num,
                                HttpServletRequest request, HttpServletResponse response);

    public List<CartItem> getCartItems(HttpServletRequest request);

    public TaotaoResult updateCartItem(long itemId, Integer num, HttpServletRequest request,
                                       HttpServletResponse response);

    public TaotaoResult deleteCartItem(long itemId, HttpServletRequest request, HttpServletResponse response);

}
