package org.kkkoke.springframework.beans.factory;

import org.kkkoke.springframework.beans.BeansException;

public interface BeanFactory {

    Object getBean(String beanName) throws BeansException;

}
