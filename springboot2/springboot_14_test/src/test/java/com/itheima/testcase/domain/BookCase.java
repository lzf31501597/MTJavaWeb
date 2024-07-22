package com.itheima.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/07/12 15:22
 * @description
 */

@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {

    private int id;
    private int id2;
    private int type;
    private String name;
    private String uuid;
    private long publishTime;

}
