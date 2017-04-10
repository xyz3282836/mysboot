package com.rz.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * Created by zhou on 2017/4/10.
 */
@Component
@ConfigurationProperties(prefix = "appconfig")
public class AppConfig {
    private String version;
    private String name;

    public AppConfig() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
