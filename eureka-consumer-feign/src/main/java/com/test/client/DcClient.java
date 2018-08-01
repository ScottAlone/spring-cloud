package com.test.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: tianren.zhang
 * @Description:
 * @Date: 9:54 2018/08/01
 */
@FeignClient("eureka-client")
public interface DcClient {

    @GetMapping("dc")
    String consumer();

}
