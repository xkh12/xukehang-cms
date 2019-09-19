package com.zhangxutao.service;

import java.util.List;

import com.zhangxutao.entity.Category;

public interface CategoryService {

	List<Category> getCategoryByChId(Integer cid);

}
