package com.gas.tr.demo01.common.exception;

import com.gas.tr.demo01.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Created by gas on 2023/08/23.
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }

}
