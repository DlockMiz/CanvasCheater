package com.canvas.cheater.canvas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CanvasClientConfig {
    @Bean
    CanvasClient canvasClient(){
        return new CanvasClient();
    }
}
