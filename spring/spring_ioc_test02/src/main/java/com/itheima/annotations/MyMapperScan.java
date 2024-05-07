package com.itheima.annotations;

import com.itheima.imports.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author
 * @version 1.0
 * @date 2024/03/21 17:18
 * @Description
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Import({MyImportBeanDefinitionRegistrar.class})
public @interface MyMapperScan {
}
