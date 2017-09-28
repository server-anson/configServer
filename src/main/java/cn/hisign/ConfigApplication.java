package cn.hisign;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] strs){
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(strs);
    }
}
