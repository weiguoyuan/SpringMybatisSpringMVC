package com.ujche.service;

import org.springframework.stereotype.Service;

import com.ujche.model.WishInfoExtend;

/**
 * 
 * @author weiguoyuan
 * */
public interface SelfdomNeedService {
	
	/**
	 * 根据用户意向id查询用户意向信息及处理人信息
	 * @param wishId
	 * @return 
	 */
	WishInfoExtend selectWishInfoExtend(int wishId); 

}
