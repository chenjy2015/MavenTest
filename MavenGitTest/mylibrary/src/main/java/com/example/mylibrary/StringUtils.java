package com.example.mylibrary;

import android.text.TextUtils;

/**
 * Created by chenjiayou on 2018/8/23.
 */

public class StringUtils {

    /**
     * 判断字符是否为空
     *
     * @param content
     *
     * @return
     */
    public static boolean isNullOrEmpty(String content) {

        return TextUtils.isEmpty(content) || "null".equals(content);
    }
}
