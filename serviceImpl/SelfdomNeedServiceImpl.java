package com.ujche.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujche.dao.SelfdomNeedMapper;
import com.ujche.model.UserInfo;
import com.ujche.model.WishInfoExtend;
import com.ujche.service.SelfdomNeedService;

@Service("SelfdomNeedService")
public class SelfdomNeedServiceImpl implements SelfdomNeedService {
	@Autowired
	private SelfdomNeedMapper selfdomNeedMapper;

	/**
	 * 通过用户名获取用户信息
	 */
	@Override
	public WishInfoExtend selectWishInfoExtend(int wishId) {
		return selfdomNeedMapper.selectWishInfoExtend(wishId);
	}


}
