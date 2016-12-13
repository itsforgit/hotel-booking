/**
 * 
 */
package com.mindtree.hotelbooking.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author M1030360
 *
 */
@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = Logger.getLogger(LoggingAspect.class);

	public LoggingAspect() {
	}

	@AfterReturning("execution(* com.mindtree.*.*(..))")
	public void logMethodAccessAfter(JoinPoint joinPoint) {
		logger.info("--- Completed: " + joinPoint.getSignature().getName() + "----");
	}

	@Before("execution(* com.mindtree.*.*(..))")
	public void logMethodAccessBefore(JoinPoint joinPoint) {
		logger.info("--- Starting: " + joinPoint.getSignature().getName() + "---");
	}
}
