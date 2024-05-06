package com.homework_5.Homework5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays;

@Aspect
@Component
public class UserActionAspect {
    @Before("@annotation(com.homework_5.Homework5.aspect.TrackUserAction)")
    public void beforeUserAction(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());

        String argsJson = Arrays.toString(args);

        System.out.println("|Время  " + timeStamp + "| Метод пользователя " + methodName + "| Аргументы в методе " + argsJson);
    }
}