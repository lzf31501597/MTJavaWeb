package com.itheima.imports;

import com.itheima.beans.OtherBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;
import java.util.function.Predicate;

/**
 * @author
 * @version 1.0
 * @date 2024/03/21 15:11
 * @Description
 */
public class MyImportSelect implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //参数AnnotationMetadata叫做注解媒体数组，该对象内部封装是当前使用了@Import注解的类上的其他注解的元信息。
        Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
        annotationAttributes.forEach((attrName, attrValue)->{
            System.out.println(attrName + "==" + attrValue);
        });
        //返回的数组封装；是需要被注册到spring容器中的Bean的权限类名
        return new String[]{OtherBean.class.getName()};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return ImportSelector.super.getExclusionFilter();
    }
}
