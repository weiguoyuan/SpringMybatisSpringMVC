package com.ujche.admin.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ujche.common.PageRequest;
import com.ujche.model.WishInfoExtend;
import com.ujche.service.SelfdomNeedService;

/**
 * @author weiguoyuan
 * */
@Controller
@RequestMapping("/admin/wishInfo")
public class SelfdomNeedController {
	@Autowired
	private SelfdomNeedService selfdomNeedService;
	
	/**
	 * 根据客户意愿编号查询客户意愿详情
	 * 
	 * @param request
	 * @param pageRequest
	 * @return
	 */
	@RequestMapping("/selectWishInfoExtend")
	public ModelAndView selectWishInfo(HttpServletRequest request,
			PageRequest pageRequest) {

		String wishId = request.getParameter("wishId");
		System.out.println(wishId);
		// String orderCode = "20150806";

		if (wishId == null) {
			return new ModelAndView("/error");
		} else {
			WishInfoExtend wishinfoExtend = selfdomNeedService.selectWishInfoExtend(Integer.parseInt(wishId));
			return new ModelAndView("/admin/wishInfo/wishInfo",
					"WishInfoExtend", wishinfoExtend);
		}
	}
}
