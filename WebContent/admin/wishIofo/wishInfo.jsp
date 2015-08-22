<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户个性化需求查看</title>
<link href="${pageContext.request.contextPath }/static_resources/admin/css/jquery-ui.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static_resources/common_js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/static_resources/common_js/jquery-ui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static_resources/admin/js/loanContract/addLoanContract.js"></script>

</head>
<body>
			<div class="position"><a href="${pageContext.request.contextPath}/admin/index.jsp" target="_top">首页</a> &gt;<a href="${pageContext.request.contextPath}/admin/orderInfo/platOrderInfoSelectList.do"> 客户个性化需求管理</a>&gt;客户个性化需求查看
			</div>
 
	  	<div class="mCon mtp7">
	        <div class="mTit">
	            <h2 class="h2 left"><em class="bico bc1"></em>订单信息
	            </h2>
	        </div>
			
			<div id="contractinfo" class="mTb htpad10">
	    <p class="fiter clearfix"></p>
	        
	        <div class="htlable">
	            <span class="fTit left">意向车型：</span>
	            <span class="left htfont">${WishInfoExtend.carType }</span>
	        </div>
	        
	        <div class="htlable">
	            <span class="fTit left">整车颜色：</span>
	            <span class="left htfont">${WishInfoExtend.carColor }</span>
	        </div>
	        
	        <div class="htlable">
	            <span class="fTit left">动力总成：</span>
	            <span class="left htfont">${WishInfoExtend.carEngine }</span>
	        </div>
	        
	         <div class="htlable">
	            <span class="fTit left">燃油类型：</span>
	            <span class="left htfont">${WishInfoExtend.carOilType }</span>
	        </div>
	        
	        <div class="htlable">
	            <span class="fTit left">价位区间：</span>
	            <span class="left htfont">${WishInfoExtend.minMoney }</span><span class="left htfont">万 至</span><span class="left htfont">${WishInfoExtend.maxMoney }</span><span class="left htfont">万</span>
	        </div>
	        <div class="clear"></div>
	         <div class="htlable">
	            <span class="fTit left">特殊要求：</span>
	            <div class="clear"></div>
	            <span class="fTit left"> &nbsp &nbsp &nbsp</span>
	            <span class="left htfont">${WishInfoExtend.carDemand }</span>
	        </div>
	       <div class="clear"></div>
	         <div class="htlable">
	            <span class="fTit left">意向客户名称：</span>
	            <span class="left htfont">${WishInfoExtend.userRealName }</span>
	        </div>
	        
	        <div class="htlable">
	            <span class="fTit left">联系电话：</span>
	            <span class="left htfont">${WishInfoExtend.phone }</span>
	        </div>
	        
	        <div class="clear"></div>
	        </div>
	    <div class="htlable">
	            <span class="fTit left">处理信息：</span>
	            <div class="clear"></div>
	            <span class="left htfont">${WishInfoExtend.checkReason }</span>
	        </div>
	        <div class="clear"></div>
	        <div class="htlable">
	            <span class="fTit left">处理人：</span>
	            <span class="left htfont">${WishInfoExtend.userInfo.userName }</span>
	        </div>
	        <div class="clear"></div>
	    <div class="htlable">
	            <span class="fTit left">处理时间：</span>
	            <span class="left htfont"><fmt:formatDate value="${WishInfoExtend.checkTime }" pattern="yyyy-MM-dd"/></span>
	        </div>
	    
	    <div class="clear"></div>
	
	
		<div class="ritBox clearfix">
			<a id="cancelBtn" class="tjbtn right"
				href="javascript:history.go(-1);">返回</a>
		</div>	
	</div>			
</body>
</html>
