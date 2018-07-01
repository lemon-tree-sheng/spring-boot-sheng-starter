package org.sheng.springbootshengstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author shengxingyue on 2018/7/1 11:07
 */
@ConfigurationProperties(prefix = "sheng")
public class ShengProperties {
    private String name = "sheng";
    private Integer age = 24;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
