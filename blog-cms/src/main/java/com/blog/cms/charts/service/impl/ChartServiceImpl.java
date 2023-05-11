package com.blog.cms.charts.service.impl;
/**
 * @program: ruo-yi-vue-blog
 * @Author: lihong
 * @Description: 〈〉
 * @Date: 2022/4/27 10:18
 */

import com.blog.cms.blog.domain.CmsBlog;
import com.blog.cms.blog.mapper.CmsBlogMapper;
import com.blog.cms.charts.service.IChartService;
import com.blog.cms.comment.domain.CmsComment;
import com.blog.cms.comment.mapper.CmsCommentMapper;
import com.blog.cms.message.domain.CmsMessage;
import com.blog.cms.message.mapper.CmsMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lihong
 * @Description:〈〉
 * @Date: 2022/4/27 10:18
 **/
@Service
public class ChartServiceImpl implements IChartService {

    @Autowired
    private CmsBlogMapper cmsBlogMapper;

    @Autowired
    private CmsCommentMapper cmsCommentMapper;

    @Autowired
    private CmsMessageMapper cmsMessageMapper;

    @Override
    public List<CmsBlog> selectList(CmsBlog cmsBlog) {
        return cmsBlogMapper.selectCmsBlogList(cmsBlog);
    }

    @Override
    public List<CmsBlog> selectListBetweenCreateTime(CmsBlog cmsBlog,String createTimeBegin,String createTimeEnd) {
        return cmsBlogMapper.selectCmsBlogListBetweenCreateTime(cmsBlog.getTitle(),cmsBlog.getType(),cmsBlog.getTop(),cmsBlog.getStatus(),createTimeBegin,createTimeEnd,cmsBlog.getCreateBy());
    }

    @Override
    public List<CmsComment> selectCmsCommentListBetweenCreateTime(CmsComment cmsComment,String createTimeBegin,String createTimeEnd) {
        return cmsCommentMapper.selectCmsCommentListBetweenCreateTime(cmsComment.getType(),cmsComment.getDelFlag(),createTimeBegin,createTimeEnd);
    }

    @Override
    public List<CmsMessage> selectCmsMessageListBetweenCreateTime(CmsMessage cmsMessage, String createTimeBegin, String createTimeEnd) {
        return cmsMessageMapper.selectCmsMessageListBetweenCreateTime(cmsMessage.getType(),cmsMessage.getDelFlag(),createTimeBegin,createTimeEnd);
    }
}
