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

package com.android.idtt.util;

import java.lang.reflect.Method;

/**
 * Author: wyouflf
 * Date: 13-6-19
 * Time: 下午9:20
 */
@SuppressWarnings("unchecked")
public class ReflectUtils {

    private ReflectUtils() {
    }

    public static StackTraceElement getCurrentMethodName() {
        StackTraceElement callerTraceElement = null;
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        return stacks[3];
    }

    public static StackTraceElement getCallerMethodName() {
        StackTraceElement callerTraceElement = null;
        StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
        return stacks[4];
    }


    public static Method getMethod(Class clazz, String methodName, Object... args) {
        Method result = null;
        Class[] types = null;
        if (args != null) {
            types = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                types[i] = args[i].getClass();
                if (types[i].equals(Integer.class)) {
                    types[i] = int.class;
                } else if (types[i].equals(Boolean.class)) {
                    types[i] = boolean.class;
                } else if (types[i].equals(Float.class)) {
                    types[i] = float.class;
                } else if (types[i].equals(Double.class)) {
                    types[i] = double.class;
                } else if (types[i].equals(Byte.class)) {
                    types[i] = byte.class;
                } else if (types[i].equals(Character.class)) {
                    types[i] = char.class;
                } else if (types[i].equals(Long.class)) {
                    types[i] = long.class;
                } else if (types[i].equals(Short.class)) {
                    types[i] = short.class;
                }
            }
        }
        try {
            result = clazz.getMethod(methodName, types);
        } catch (NoSuchMethodException e) {
            for (int i = 0; i < args.length; i++) {
                types[i] = args[i].getClass();
            }
            try {
                result = clazz.getMethod(methodName, types);
            } catch (NoSuchMethodException e1) {
            }
        }
        return result;
    }
}
