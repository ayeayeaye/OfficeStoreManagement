package com.example.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.model.Item;
import com.example.service.CategoryService;
import com.example.service.ItemService;

@Controller
@RequestMapping(value="/all")
public class GeneralController {

	@Autowired
	CategoryService cService;
	@Autowired
	ItemService iService;
	
	
	@RequestMapping(value="/view/catalogue")
	public ModelAndView viewCatalogueG()
	{
		ArrayList<Item> itemList = iService.findAllItem();
		return new ModelAndView("view-catalogue","itemList", itemList);
		
	}

}