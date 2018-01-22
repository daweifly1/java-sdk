package com.netease.vcloud.upload.param;


/**
 * <p>Title: QueryVideoIDorWatermarkIDParam</p>
 * <p>Description: 根据对象名查询视频ID输出参数的封装类</p>
 * <p>Company: com.netease.vcloud</p>
 *
 * @date 2016-6-27
 */
public class GetVideoDetailParam {

    /**
     * 输出参数中的响应码
     */
    private Integer code;

    /**
     * 输出参数中的ret部分
     */
    private GetVideoDetailRet ret;

    private String requestId;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public GetVideoDetailRet getRet() {
        return ret;
    }

    public void setRet(GetVideoDetailRet ret) {
        this.ret = ret;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
