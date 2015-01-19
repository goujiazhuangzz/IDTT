

package com.android.idtt.view.annotation.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 *  @Project       : IDTT
 *  @Program Name  : com.android.idtt.view.annotation.event.OnCheckedChange.java
 *  @Class Name    : OnCheckedChange
 *  @Description   : 类描述
 *  @Author        : zhiqiang
 *  @Creation Date : 2015-1-19 上午9:37:13 
 *  @ModificationHistory  
 *  Who        When          What 
 *  --------   ----------    -----------------------------------
 *  username   2015-1-19       TODO
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OnCheckedChange {
    int[] value();
}
