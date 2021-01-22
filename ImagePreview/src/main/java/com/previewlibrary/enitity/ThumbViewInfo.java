package com.previewlibrary.enitity;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author yangc
 * date 2017/4/26
 * E-Mail:yangchaojiang@outlook.com
 * Deprecated: 图片预览接口
 */
public class ThumbViewInfo implements Parcelable {
    String url;
    Rect bounds;
    String videoUrl;

    public ThumbViewInfo() {

    }

    public ThumbViewInfo(String url) {
        this.url = url;
    }

    public ThumbViewInfo(String url,
                         Rect bounds) {
        this.url = url;
        this.bounds = bounds;
    }

    public ThumbViewInfo(String url,
                         Rect bounds,
                         String videoUrl) {
        this.url = url;
        this.bounds = bounds;
        this.videoUrl = videoUrl;
    }

    public ThumbViewInfo(String url,
                         View boundsView,
                         String videoUrl) {
        this.url = url;
        this.videoUrl = videoUrl;
        if (boundsView != null) {
            Rect bounds = new Rect();
            boundsView.getGlobalVisibleRect(bounds);
            this.bounds = bounds;
        } else {
            this.bounds = null;
        }

    }

    public ThumbViewInfo(String url,
                         View boundsView) {
        this.url = url;
        if (boundsView != null) {
            Rect bounds = new Rect();
            boundsView.getGlobalVisibleRect(bounds);
            this.bounds = bounds;
        } else {
            this.bounds = null;
        }

    }

    protected ThumbViewInfo(Parcel in) {
        url = in.readString();
        bounds = in.readParcelable(Rect.class.getClassLoader());
        videoUrl = in.readString();
    }

    public static final Creator<ThumbViewInfo> CREATOR = new Creator<ThumbViewInfo>() {
        @Override
        public ThumbViewInfo createFromParcel(Parcel in) {
            return new ThumbViewInfo(in);
        }

        @Override
        public ThumbViewInfo[] newArray(int size) {
            return new ThumbViewInfo[size];
        }
    };

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBounds(Rect bounds) {
        this.bounds = bounds;
    }

    public void setBoundsView(View boundsView) {
        if (boundsView != null) {
            Rect bounds = new Rect();
            boundsView.getGlobalVisibleRect(bounds);
            this.bounds = bounds;
        } else {
            this.bounds = null;
        }
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /****
     * 图片地址
     * @return String
     * ****/
    public String getUrl() {
        return url;
    }

    /**
     * 记录坐标
     *
     * @return Rect
     ***/
    public Rect getBounds() {
        return bounds;
    }


    /**
     * 获取视频链接
     ***/
    @Nullable
    public String getVideoUrl() {
        return videoUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(url);
        dest.writeParcelable(bounds, flags);
        dest.writeString(videoUrl);
    }
}
