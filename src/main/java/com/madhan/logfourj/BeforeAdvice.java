/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.logfourj;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class BeforeAdvice implements MethodBeforeAdvice {

static Logger log = Logger.getLogger(MainApp.class.getName());

@Override
public void before(Method method, Object[] args, Object target) throws Throwable {
    log.info("Call before method advice");
}

}
