<%--
网站: <a href="http://www.nuc.edu.cn/">中北大学</a>
author  2015 FanYu
version  1.0
Copyright (C), 2015 FanYu
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%@ page contentType="text/html; charset=utf-8" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="author" content="Yeeku.H.Lee(nuc.edu.cn)" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>您参与的全部竞价</title>
</head>
<body>
<table width="780" align="center" cellspacing="0"
	background="images/bodybg.jpg">
<tr>
<td>
<br />
<table width="80%" align="center" cellpadding="0" cellspacing="1" style="border:1px solid black">
  <tr>
    <td colspan="4" ><div class="mytitle">您参与的全部竞价</div></td> 
  </tr>
  <tr  height="30">
    <th>物品名</th>
    <th>竞标价格</th>
    <th>竞标时间</th>
    <th>竞标人</th>
  </tr>
<s:iterator value="bids" id="bid" status="st">
<tr  height="24" <s:if test="#st.odd">
	style="background-color:#dddddd"</s:if>
	<s:else>style="background-color:#eeeeee"</s:else>>
	<td><s:property value="item"/></td>
	<td><s:property value="price"/></td>
	<td><s:property value="bidDate"/></td>
	<td><s:property value="user"/></td>
</tr>
</s:iterator>
</table>
</td>
</tr>
</table>
</body>
</html>