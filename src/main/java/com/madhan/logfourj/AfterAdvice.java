/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhan.logfourj;

import static com.madhan.logfourj.BeforeAdvice.log;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author Madhankumar Selvaraj
 */
public class AfterAdvice implements AfterReturningAdvice{
    static Logger log = Logger.getLogger(MainApp.class.getName());
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        log.info("Call after method advice");
    }
    
}
