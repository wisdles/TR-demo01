package com.gas.tr.demo01.config;

import com.gas.tr.demo01.common.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 * Created by gas on 2023/08/23.
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig {
}
