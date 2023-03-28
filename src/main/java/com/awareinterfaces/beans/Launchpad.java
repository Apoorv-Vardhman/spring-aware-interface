package com.awareinterfaces.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author : Apoorva Raj
 * @mailto : apoorv.vardhman@gmail.com
 * @LinkedIn : apoorv-vardhman
 **/
public class Launchpad implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public void launch(){
        // TODO there are two ways to use functionality of the Rocket 1. Inheritance 2. Composition
        // TODO for composition there are 2 ways 1. create object 2. pull the object from IOC (recommended)
        // TODO When we will declare classes as bean definition then IOC will create object
        Rocket rocket = null;
        // TODO If we want to access internal object of IOC container then we will go for aware interface
        rocket = beanFactory.getBean("rocket", Rocket.class);
        rocket.propel();
        System.out.println("rocket has launched....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
