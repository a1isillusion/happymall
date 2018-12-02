package com.happymall.service;

import com.happymall.common.ServerResponse;
import com.happymall.pojo.Category;

import java.util.List;

/**
 * Created by 郭江彬 on 2018/11/30 0030.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
