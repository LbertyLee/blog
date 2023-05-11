package com.blog.cms.charts.service;

import com.blog.cms.blog.domain.CmsBlog;
import com.blog.cms.comment.domain.CmsComment;
import com.blog.cms.message.domain.CmsMessage;

import java.util.List;

/**
 * @program: ruo-yi-vue-blog
 * @Author: lihong
 * @Description: 〈${DESCRIPTION}〉
 * @Date: 2022/4/27 10:17
 */
public interface IChartService {
    public List<CmsBlog> selectList(CmsBlog cmsBlog);
    public List<CmsBlog> selectListBetweenCreateTime(CmsBlog cmsBlog,String createTimeBegin,String createTimeEnd);
    public List<CmsComment> selectCmsCommentListBetweenCreateTime(CmsComment cmsComment,String createTimeBegin,String createTimeEnd);
    public List<CmsMessage> selectCmsMessageListBetweenCreateTime(CmsMessage cmsMessage,String createTimeBegin,String createTimeEnd);
}
