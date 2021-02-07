package com.example.previewpicture.app;

import android.content.Context;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.request.target.ViewTarget;
import com.example.previewpicture.R;

/**
 * Created by yangchaojiang on 2016/8/14.
 * GlideModule 图片加载缓存
 */
public class MyGlideModule implements GlideModule {
  public static   int cacheSize100MegaBytes = 504857600;

    @Override
    public void applyOptions(final Context context, GlideBuilder builder) {
      
    }


    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {

    }
}

