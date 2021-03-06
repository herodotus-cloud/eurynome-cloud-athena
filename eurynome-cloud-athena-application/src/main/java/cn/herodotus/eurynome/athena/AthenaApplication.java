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
 * Module Name: eurynome-cloud-athena-application
 * File Name: AthenaApplication.java
 * Author: gengwei.zheng
 * Date: 2020/12/30 09:00:30
 */

package cn.herodotus.eurynome.athena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Project: eurynome-cloud-athena </p>
 * <p>File: AthenaApplication.java </p>
 *
 * <p>Description: 应用启动文件 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/12/29 20:52
 */
@SpringBootApplication
public class AthenaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AthenaApplication.class, args);
    }

}
