package com.hpmanframeforapp;

import java.io.IOException;

import okhttp3.Response;

import com.google.gson.Gson;
import com.hpFrame.http.okhttp.callback.Callback;

/**
 * Created by zhy on 15/12/14.
 */
public abstract class UserCallback extends Callback<User>
{
    @Override
    public User parseNetworkResponse(Response response) throws IOException
    {
        String string = response.body().string();
        User user = new Gson().fromJson(string, User.class);
        return user;
    }


}
