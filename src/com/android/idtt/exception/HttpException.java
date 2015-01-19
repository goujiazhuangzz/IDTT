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

package com.android.idtt.exception;

public class HttpException extends BaseException {
    private static final long serialVersionUID = 1L;

    private int exceptionCode;

    public HttpException() {
    }

    public HttpException(String detailMessage) {
        super(detailMessage);
    }

    public HttpException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public HttpException(Throwable throwable) {
        super(throwable);
    }

    public HttpException(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public HttpException(int exceptionCode, String detailMessage) {
        super(detailMessage);
        this.exceptionCode = exceptionCode;
    }

    public HttpException(int exceptionCode, String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
        this.exceptionCode = exceptionCode;
    }

    public HttpException(int exceptionCode, Throwable throwable) {
        super(throwable);
        this.exceptionCode = exceptionCode;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }
}
