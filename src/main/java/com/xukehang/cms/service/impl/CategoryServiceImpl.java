package com.xukehang.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xukehang.cms.dao.CategoryMapper;
import com.xukehang.cms.entity.Category;
import com.xukehang.cms.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryMapper categoryMapper; 
	
	@Override
	public List<Category> getCategoryByChId(Integer cid) {
		// TODO Auto-generated method stub
		return categoryMapper.getCategoryByChId(cid) ;
	}

}
