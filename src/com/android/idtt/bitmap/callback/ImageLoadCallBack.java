/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.idtt.bitmap.callback;

import android.graphics.Bitmap;
import android.widget.ImageView;

import com.android.idtt.bitmap.BitmapDisplayConfig;

public interface ImageLoadCallBack {

    /**
     * 图片加载完成 回调的函数
     *
     * @param imageView
     * @param bitmap
     * @param config
     */
    void loadCompleted(ImageView imageView, Bitmap bitmap, BitmapDisplayConfig config);

    /**
     * 图片加载失败回调的函数
     *
     * @param imageView
     * @param bitmap
     */
    void loadFailed(ImageView imageView, Bitmap bitmap);

}
