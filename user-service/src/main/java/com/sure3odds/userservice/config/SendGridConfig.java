package com.sure3odds.userservice.config;

import com.sendgrid.SendGrid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendGridConfig {

    @Value("${sure.sendgrid.api-key}")
    private String appKey;

    @Bean
    public SendGrid getSendGrid(){
        return new SendGrid(appKey);
    }
}
