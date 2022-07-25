package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {
    int count = 0;

    @Around("@annotation(com.example.demo.aspect.TestAspectInterface)")
    public Object beforeTest(ProceedingJoinPoint pjp) throws Throwable {
        count++;
        if (count % 2 == 0) {
            return null;
        } else {
            return pjp.proceed();
        }
    }
}
