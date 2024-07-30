package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/07/26 16:56
 * @description
 */

@Component
@ConfigurationProperties(prefix = "memcached")
@Data
public class XMemcachedProperties {

    private String servers;
    private int poolSize;
    private long opTimeout;

}
