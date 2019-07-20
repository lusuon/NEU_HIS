package org.neu.his.common;

import org.neu.his.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by neu on 2017/12/30.
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
