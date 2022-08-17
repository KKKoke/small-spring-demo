package org.kkkoke.springframework.beans.factory.support;

import org.kkkoke.springframework.beans.BeansException;
import org.kkkoke.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * Bean 实例化策略
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
    
}
