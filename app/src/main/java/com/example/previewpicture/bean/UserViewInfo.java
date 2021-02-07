package com.example.previewpicture.bean;

import android.graphics.Rect;
import android.os.Parcel;
import androidx.annotation.Nullable;

import com.previewlibrary.enitity.ThumbViewInfo;

/**
 *
 * @author yangc
 * @date 2017/4/26
 * E-Mail:yangchaojiang@outlook.com
 * Deprecated: 图片预览实体类
 **/
public class UserViewInfo  extends ThumbViewInfo{

    private String user = "用户字段";


    public UserViewInfo(String url) {
        setUrl(url);
    }
    public UserViewInfo(String videoUrl,String url) {
        setUrl(url);
        setVideoUrl(videoUrl);
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
