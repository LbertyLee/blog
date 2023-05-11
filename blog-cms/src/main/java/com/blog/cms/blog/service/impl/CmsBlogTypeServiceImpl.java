package com.blog.cms.blog.service.impl;
/**
 * @program: RuoYi-Vue
 * @Author: lihong
 * @Description: 〈〉
 * @Date: 2022/1/2 23:44
 */

import com.blog.cms.blog.domain.CmsBlogType;
import com.blog.cms.blog.mapper.CmsBlogTypeMapper;
import com.blog.cms.blog.service.ICmsBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lihong
 * @Description:〈〉
 * @Date: 2022/1/2 23:44
 **/
@Service
public class CmsBlogTypeServiceImpl implements ICmsBlogTypeService {

    @Autowired
    CmsBlogTypeMapper cmsBlogTypeMapper;

    @Override
    public int batchBlogType(List<CmsBlogType> blogTypeList) {
        return cmsBlogTypeMapper.batchBlogType(blogTypeList);
    }

    @Override
    public int deleteBlogTypeByBlogId(Long blogId) {
        return cmsBlogTypeMapper.deleteBlogTypeByBlogId(blogId);
    }

    @Override
    public int deleteBlogType(Long[] ids) {
        return cmsBlogTypeMapper.deleteBlogType(ids);
    }

    @Override
    public List<CmsBlogType> selectBlogTypeList(Long blogId) {
        return cmsBlogTypeMapper.selectBlogTypeList(blogId);
    }
}
