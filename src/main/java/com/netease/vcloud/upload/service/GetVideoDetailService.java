package com.netease.vcloud.upload.service;

import com.netease.vcloud.VcloudException;
import com.netease.vcloud.upload.param.GetVideoDetailParam;

import java.io.IOException;

public interface GetVideoDetailService {

    GetVideoDetailParam getVideoDetail(Long vid) throws IOException, VcloudException;
}