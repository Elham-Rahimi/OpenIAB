/*
 * Copyright 2012-2014 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.oms.util;

import android.text.TextUtils;
import android.util.Log;

/**
 * Utility for log events. For log event set
 * {@link #setLoggable(boolean)} to true.
 *
 * @author Kirill Rozov
 * @since 25.07.14
 */
public final class Logger {

    private Logger() {}

    public static final String LOG_TAG = "OpenIAB";

    private static String logTag = LOG_TAG;
    private static boolean loggable;

    public static boolean isLoggable() {
        return loggable;
    }

    public static void setLoggable(boolean loggable) {
        Logger.loggable = loggable;
    }

    @Deprecated
    public static void init() {}

    public static void setLogTag(final String logTag) {
        Logger.logTag = TextUtils.isEmpty(logTag) ? LOG_TAG : logTag;
    }

    public static void d(Object... values) {
        if (loggable || Log.isLoggable(logTag, Log.DEBUG)) {
            Log.d(logTag, TextUtils.join("", values));
        }
    }

    public static void i(Object... values) {
        if (loggable || Log.isLoggable(logTag, Log.INFO)) {
            Log.i(logTag, TextUtils.join("", values));
        }
    }

    public static void i(String msg) {
        if (loggable || Log.isLoggable(logTag, Log.INFO)) {
            Log.i(logTag, msg);
        }
    }

    public static void d(String msg) {
        if (loggable || Log.isLoggable(logTag, Log.DEBUG)) {
            Log.d(logTag, msg);
        }
    }

    @Deprecated
    public static void dWithTimeFromUp(String msg) {
        d(msg);
    }

    @Deprecated
    public static void dWithTimeFromUp(Object... msgs) {
        d(msgs);
    }

    public static void e(Object... msgs) {
        if (loggable || Log.isLoggable(logTag, Log.ERROR)) {
            Log.e(logTag, TextUtils.join("", msgs));
        }
    }

    public static void e(String msg, Throwable e) {
        if (loggable || Log.isLoggable(logTag, Log.ERROR)) {
            Log.e(logTag, msg, e);
        }
    }


    public static void e(String msg) {
        if (loggable || Log.isLoggable(logTag, Log.ERROR)) {
            Log.e(logTag, msg);
        }
    }
    public static void e(Throwable e, Object... msgs) {
        if (loggable || Log.isLoggable(logTag, Log.ERROR)) {
            Log.e(logTag, TextUtils.join("", msgs), e);
        }
    }

    public static void w(String msg) {
        if (loggable || Log.isLoggable(logTag, Log.WARN)) {
            Log.w(logTag, msg);
        }
    }

    public static void w(String msg, Throwable e) {
        if (loggable || Log.isLoggable(logTag, Log.WARN)) {
            Log.w(logTag, msg, e);
        }
    }

    public static void v(Object... msgs) {
        if (loggable || Log.isLoggable(logTag, Log.VERBOSE)) {
            Log.v(logTag, TextUtils.join("", msgs));
        }
    }

    public static void w(Object... values) {
        if (loggable || Log.isLoggable(logTag, Log.VERBOSE)) {
            Log.w(logTag, TextUtils.join("", values));
        }
    }
}