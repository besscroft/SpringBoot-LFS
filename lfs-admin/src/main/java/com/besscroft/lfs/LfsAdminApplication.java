package com.besscroft.lfs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@EnableCaching
@EnableJpaAuditing
@SpringBootApplication(scanBasePackages = "com.besscroft.lfs")
public class LfsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LfsAdminApplication.class, args);
        log.info("(♥◠‿◠)ﾉﾞ  LFS服务启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }

}
