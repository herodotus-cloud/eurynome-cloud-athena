/*
 * Copyright (c) 2019-2021 Gengwei Zheng(herodotus@aliyun.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project Name: eurynome-cloud-athena
 * Module Name: eurynome-cloud-athena-kernel
 * File Name: AthenaKernelConfiguration.java
 * Author: gengwei.zheng
 * Date: 2021/01/21 13:15:21
 */

package cn.herodotus.eurynome.athena.kernel.configuration;

import cn.herodotus.eurynome.athena.kernel.processor.HerodotusBusBridge;
import cn.herodotus.eurynome.module.upms.rest.configuration.UpmsRestModuleConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.bus.BusBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;

/**
 * <p>Project: eurynome-cloud-athena </p>
 * <p>File: AthenaKernelConfiguration </p>
 *
 * <p>Description: 单体版基础核心配置 </p>
 *
 * @author : gengwei.zheng
 * @date : 2021/1/18 10:49
 */
@Slf4j
@Configuration(proxyBeanMethods = false)
@Import({
        UpmsRestModuleConfiguration.class
})
public class AthenaKernelConfiguration {

    @PostConstruct
    public void postConstruct() {
        log.info("[Eurynome] |- Components [Athena Kernel] Auto Configure.");
    }

    @Bean
    public BusBridge busBridge() {
        return new HerodotusBusBridge();
    }
}
