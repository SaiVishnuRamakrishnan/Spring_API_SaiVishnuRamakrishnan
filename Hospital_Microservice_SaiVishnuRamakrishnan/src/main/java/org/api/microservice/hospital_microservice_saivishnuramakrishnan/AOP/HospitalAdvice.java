package org.api.microservice.hospital_microservice_saivishnuramakrishnan.AOP;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.api.microservice.hospital_microservice_saivishnuramakrishnan.Controller.HospitalController;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import java.time.Instant;

@Aspect
@Controller
public class HospitalAdvice {

    Logger logger = LoggerFactory.getLogger(HospitalAdvice.class);
    //point cut will determine which are the files will get triggered
    @Pointcut(value = "execution(* org.api.microservice.hospital_microservice_saivishnuramakrishnan.*.*.*(..))")
    void pointCutForLogging() {
    }

    @Around(value = "pointCutForLogging()")
    public void loogingAdvice(ProceedingJoinPoint pjp) throws Throwable {
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().getName();
        Object args[] = pjp.getArgs();
        ObjectMapper mapper = new ObjectMapper();
        logger.info(Instant.now() + "Class: " + className + "Method: "
                + methodName
                + "has started execution "
                + "with argument: " + mapper.writeValueAsString(args));
        Object returnData = pjp.proceed();
        logger.info(Instant.now() + "Class: " + className + "Method: "
                + methodName
                + "has started execution "
                + "with return data: " + mapper.writeValueAsString(returnData));
    }
}
