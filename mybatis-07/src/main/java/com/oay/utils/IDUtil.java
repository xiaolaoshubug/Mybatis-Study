package com.oay.utils;

import java.util.UUID;

/*********************************************************
 * @Package: com.oay.utils
 * @ClassName: IDutils.java
 * @Description£∫√Ë ˆ
 * -----------------------------------
 * @author£∫ouay
 * @Version£∫v1.0
 * @Date: 2020-11-25
 *********************************************************/
public class IDUtil {

    public static String genId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
