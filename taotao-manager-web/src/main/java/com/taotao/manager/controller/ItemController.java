package com.taotao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.Item;
import com.taotao.manager.service.ItemService;

@Controller
@RequestMapping("item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String saveItem(Item item, String desc) {
		this.itemService.saveItem(item, desc);
		
		return "商品增加成功";
	}
}
