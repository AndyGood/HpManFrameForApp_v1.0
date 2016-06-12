package com.hpFrame.http.okhttp.builder;

import com.hpFrame.http.okhttp.OkHttpUtils;
import com.hpFrame.http.okhttp.request.OtherRequest;
import com.hpFrame.http.okhttp.request.RequestCall;

/**
 * Created by zhy on 16/3/2.
 */
public class HeadBuilder extends GetBuilder
{
    @Override
    public RequestCall build()
    {
        return new OtherRequest(null, null, OkHttpUtils.METHOD.HEAD, url, tag, params, headers).build();
    }
}
