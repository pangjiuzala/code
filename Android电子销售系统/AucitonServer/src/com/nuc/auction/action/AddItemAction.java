package com.nuc.auction.action;

import java.util.*;

import com.nuc.auction.action.base.BaseAction;
import com.nuc.auction.domain.*;
import com.nuc.auction.exception.AuctionException;
import com.nuc.auction.service.AuctionManager;
import com.opensymphony.xwork2.ActionContext;

/**
 * Description: <br/>
 * 网站: <a href="http://www.nuc.edu.cn/">中北大学</a> <br/>
 * Copyright (C), 2015 FanYu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author 2015 FanYu
 * @version 1.0
 */
public class AddItemAction extends BaseAction {
	private Item item;
	private int avail;
	private int kindId;
	private String vercode;

	// 处理用户请求的execute方法
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		String ver2 = (String) session.get("rand");
		// 强制系统刚生成的随机验证码失效
		session.put("rand", null);
		Integer userId = (Integer) session.get("userId");
		// 如果用户输入的验证码与系统随机产生的验证码相同
		if (vercode.equals(ver2)) {
			// 根据用户选择有效时间选项，指定实际的有效时间
			switch (avail) {
			case 6:
				avail = 7;
				break;
			case 7:
				avail = 30;
				break;
			case 8:
				avail = 365;
				break;
			}
			// 添加物品
			mgr.addItem(item, avail, kindId, userId);
			return SUCCESS;
		} else {
			addActionError("验证码不匹配,请重新输入");
			return INPUT;
		}
	}

	// item的setter和getter方法
	public void setItem(Item item) {
		this.item = item;
	}

	public Item getItem() {
		return this.item;
	}

	// avail的setter和getter方法
	public void setAvail(int avail) {
		this.avail = avail;
	}

	public int getAvail() {
		return this.avail;
	}

	// kindId的setter和getter方法
	public void setKindId(int kindId) {
		this.kindId = kindId;
	}

	public int getKindId() {
		return this.kindId;
	}

	// vercode的setter和getter方法
	public void setVercode(String vercode) {
		this.vercode = vercode;
	}

	public String getVercode() {
		return this.vercode;
	}
}