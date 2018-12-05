package com.example.timetask.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @Author: linjie
 * @Description: 定时任务
 * @Date: 下午 17:33 2018/7/30 0024
 */
@Component
public class ScheduledTask {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * @Author: linjie
     * @Description: 每间隔10秒输出任务
     * @Date: 下午 17:35 2018/7/30 0024
     */
    @Scheduled(fixedRate = 10000)
    public void LogTime(){
        logger.info("定时任务"+System.currentTimeMillis());
    }
}
