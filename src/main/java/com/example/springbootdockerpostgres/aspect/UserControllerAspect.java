package com.example.springbootdockerpostgres.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserControllerAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Around("execution(* com.example.springbootdockerpostgres.controller.UserController.findAllUsers(..))")
    public Object findAllUsersAround(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Kullanıcı listesi isteği gönderildi.");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("Kullanıcı listesi isteği başarıyla gerçekleşti. ");
        logger.info("Value : " + value);
        return value;
    }

    @Around("execution(* com.example.springbootdockerpostgres.controller.UserController.getByUserId(..))")
    public Object getByUserIdAround(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Kullanıcı id isteği gönderildi.");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("Kullanıcı id isteği başarıyla gerçekleşti. ");
        logger.info("Value : " + value);
        return value;
    }

    @Around("execution(* com.example.springbootdockerpostgres.controller.UserController.createUser(..))")
    public Object createUserAround(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Kullanıcı kayıt isteği gönderildi.");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("Kullanıcı kayıt isteği başarıyla gerçekleşti. ");
        logger.info("Value : " + value);
        return value;
    }

    @Around("execution(* com.example.springbootdockerpostgres.controller.UserController.updateUser(..))")
    public Object updateUserAround(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Kullanıcı kayıt güncelleme isteği gönderildi.");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("Kullanıcı kayıt güncelleme isteği başarıyla gerçekleşti. ");
        logger.info("Value : " + value);
        return value;
    }

    @Around("execution(* com.example.springbootdockerpostgres.controller.UserController.deleteUser(..))")
    public Object deleteUserAround(ProceedingJoinPoint proceedingJoinPoint) {
        logger.info("Kullanıcı kayıt silme isteği gönderildi.");
        Object value = null;
        try {
            value = proceedingJoinPoint.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("Kullanıcı kayıt silme isteği başarıyla gerçekleşti. ");
        logger.info("Value : " + value);
        return value;
    }


}
