package org.sheng.springbootshengstarter;

/**
 * @author shengxingyue on 2018/7/1 11:11
 */
public class ShengService {

    ShengProperties shengProperties;

    ShengService(ShengProperties shengProperties) {
        this.shengProperties = shengProperties;
    }

    public String sayHi() {
        return "hello, " + shengProperties.getName();
    }
}
