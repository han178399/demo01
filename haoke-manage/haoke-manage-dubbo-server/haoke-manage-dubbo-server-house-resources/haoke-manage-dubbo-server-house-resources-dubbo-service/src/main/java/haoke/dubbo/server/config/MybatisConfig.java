package haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author hanhanhan
 * @Date 2019/8/2 0002 19:13
 */
@MapperScan("haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {
}
