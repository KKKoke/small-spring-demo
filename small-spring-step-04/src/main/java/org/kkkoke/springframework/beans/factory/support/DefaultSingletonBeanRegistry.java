package org.kkkoke.springframework.beans.factory.support;

import org.kkkoke.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private final Map<String, Object> singletonBeanMap = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonBeanMap.get(beanName);
    }

    protected void addSingleton(String beanName, Object singleBean) {
        singletonBeanMap.put(beanName, singleBean);
    }
}
