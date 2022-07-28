package org.kkkoke.springframework.beans.factory.support;

import org.kkkoke.springframework.beans.BeansException;
import org.kkkoke.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
    
}
