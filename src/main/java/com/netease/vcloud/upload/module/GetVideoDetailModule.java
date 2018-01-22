package com.netease.vcloud.upload.module;


public class GetVideoDetailModule {
    private Long vid;

    public Long getVid() {
        return vid;
    }

    public void setVid(Long vid) {
        this.vid = vid;
    }

    public GetVideoDetailModule(Long vid) {
        this.vid = vid;
    }
}
