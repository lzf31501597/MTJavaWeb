package com.itheima.handlers;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author
 * @version 1.0
 * @date 2024/03/06 18:00
 * @Description
 */
public class HaohaoNamespaceHandler extends NamespaceHandlerSupport {
    //初始化：一般情况下，如果一个命名空间有多个标签，那么会在init方法中为每个标签注册一个标签解析器
    //初期化: 一般に、名前空間に複数のタグがある場合、init メソッドのタグごとにタグ パーサーが登録されます。
    @Override
    public void init() {
        this.registerBeanDefinitionParser("annotation-driven", new HaohaoBeanDefinitionParser());
    }
}
