package com.anhvt.prj.vchecker.config.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {
    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "dzuahpxqv",
                "api_key", "915773112269835",
                "api_secret", "e-9r78TeHP93EpWc6X38Y_RD8SE"));
    }
}