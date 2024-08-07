package com.itheima.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * @author
 * @version 1.0
 * @date 2024/07/30 16:33
 * @description
 */
@Component
public class MyQuartz extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        long l = System.currentTimeMillis();
        System.out.println("quartz task run ...");
    }
}
