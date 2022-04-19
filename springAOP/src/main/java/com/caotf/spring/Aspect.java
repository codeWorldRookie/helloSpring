package com.caotf.spring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Aspect implements MethodBeforeAdvice {
   @Override
   public void before(Method method, Object[] objects, Object o) throws Throwable {
      System.out.println("调用开始");
   }
}
