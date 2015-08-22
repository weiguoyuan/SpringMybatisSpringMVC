package com.ujche.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 意向信息
 * @author mawei
 *
 */
public class WishInfo {

	/**
	 * 主编id
	 */
	private int wishId;
	/**
	 * 意向车型
	 */
	private String carType;
	/**
	 * 整车颜色
	 */
	private String carColor;
	/**
	 * 动力总成
	 */
	private String carEngine;
	/**
	 * 燃油类型（0：汽油 1：柴油 默认0）
	 */
	private int carOilType;
	/**
	 * 特殊要求
	 */
	private String carDemand;
	/**
	 * 价格区间（最小值）
	 */
	private BigDecimal minMoney;
	/**
	 * 价格区间（最大值）
	 */
	private BigDecimal maxMoney;
	/**
	 * 真实姓名
	 */
	private String userRealName;
	/**
	 * 用户电话
	 */
	private String phone;
	/**
	 * 处理状态（0：待处理 1：已处理 默认0）
	 */
	private int status;
	/**
	 * 处理人
	 */
	private int checkUserId;
	/**
	 * 审核意见
	 */
	private String checkReason;
	/**
	 * 处理时间
	 */
	private Date checkTime;
	/**
	 * 插入时间（默认当前时间）
	 */
	private Date addTime;
	
	public int getWishId() {
		return wishId;
	}
	public void setWishId(int wishId) {
		this.wishId = wishId;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarEngine() {
		return carEngine;
	}
	public void setCarEngine(String carEngine) {
		this.carEngine = carEngine;
	}
	public int getCarOilType() {
		return carOilType;
	}
	public void setCarOilType(int carOilType) {
		this.carOilType = carOilType;
	}
	public String getCarDemand() {
		return carDemand;
	}
	public void setCarDemand(String carDemand) {
		this.carDemand = carDemand;
	}
	public BigDecimal getMinMoney() {
		return minMoney;
	}
	public void setMinMoney(BigDecimal minMoney) {
		this.minMoney = minMoney;
	}
	public BigDecimal getMaxMoney() {
		return maxMoney;
	}
	public void setMaxMoney(BigDecimal maxMoney) {
		this.maxMoney = maxMoney;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCheckUserId() {
		return checkUserId;
	}
	public void setCheckUserId(int checkUserId) {
		this.checkUserId = checkUserId;
	}
	public String getCheckReason() {
		return checkReason;
	}
	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
	}
	public Date getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	
}
