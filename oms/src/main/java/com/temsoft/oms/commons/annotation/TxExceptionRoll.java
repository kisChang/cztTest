package com.temsoft.oms.commons.annotation;


import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * Exception 回滚事务
 *
 * @author KisChang
 * @version 1.0
 * @date 2016年01月23日
 * @since 1.0
 */
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
public @interface TxExceptionRoll {
}
