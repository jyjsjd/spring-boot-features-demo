package cn.emac.demo.petstore.configs;

import cn.emac.demo.petstore.controllers.MyErrorController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Emac
 * @since 2016-03-20
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter implements EmbeddedServletContainerCustomizer {

    @Value("${server.error.path:${error.path:/error}}")
    private String path = "/error";

    @Bean
    public MyErrorController errorController() {
        // uniform error control
        ErrorAttributes errorAttributes = new DefaultErrorAttributes();
        ErrorProperties errorProperties = new ErrorProperties();
        return new MyErrorController(errorAttributes, errorProperties);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer factory) {
        // highest priority: fine-grained error control for each HTTP status
        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, path));
        factory.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, path));
    }
}
