package com.netease.vcloud.upload.service.impl;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.module.GetVideoDetailModule;
import com.netease.vcloud.upload.param.GetVideoDetailParam;
import com.netease.vcloud.upload.service.GetVideoDetailService;
import com.netease.vcloud.upload.util.UploadUtil;

import java.io.IOException;

/**
 * Created by hzchendawei on 2018/1/22.
 */
public class GetVideoDetailServiceImpl implements GetVideoDetailService {
    public GetVideoDetailParam getVideoDetail(Long vid) throws IOException, VcloudException {
        GetVideoDetailModule getVideoDetailModule = new GetVideoDetailModule(vid);
        UploadUtil util = new UploadUtil(getVideoDetailModule);
        GetVideoDetailParam getVideoDetailParam = util.getVideoDetail();
        return getVideoDetailParam;
    }
}
