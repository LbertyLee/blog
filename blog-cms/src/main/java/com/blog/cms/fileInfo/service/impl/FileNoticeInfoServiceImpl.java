package com.blog.cms.fileInfo.service.impl;
/**
 * @program: RuoYi-Vue
 * @Author: lihong
 * @Description: 〈〉
 * @Date: 2021/12/31 23:33
 */

import com.blog.cms.fileInfo.domain.FileNoticeInfo;
import com.blog.cms.fileInfo.mapper.FileNoticeInfoMapper;
import com.blog.cms.fileInfo.service.IFileNoticeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lihong
 * @Description:〈〉
 * @Date: 2021/12/31 23:33
 **/
@Service
public class FileNoticeInfoServiceImpl implements IFileNoticeInfoService {

    @Autowired
    private FileNoticeInfoMapper fileNoticeInfoMapper;

    @Override
    public int batchFileNotice(List<FileNoticeInfo> fileNoticeList) {
        return fileNoticeInfoMapper.batchFileNotice(fileNoticeList);
    }

    @Override
    public int deleteFileNoticeByNoticeId(Long noticeId) {
        return fileNoticeInfoMapper.deleteFileNoticeByNoticeId(noticeId);
    }

    @Override
    public int deleteFileNotice(Long[] ids) {
        return fileNoticeInfoMapper.deleteFileNotice(ids);
    }

    @Override
    public List<FileNoticeInfo> selectFileNoticeList(Long noticeId) {
        return fileNoticeInfoMapper.selectFileNoticeList(noticeId);
    }
}
