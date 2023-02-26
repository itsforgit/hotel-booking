/**
 * 
 */
package com.learning.hotelbooking.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author M1030360
 *
 */
@Aspect
@Component
public class LoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	public LoggingAspect() {
	}

	@AfterReturning("execution(* com.learning.hotelbooking.*.*(..))")
	public void logMethodAccessAfter(JoinPoint joinPoint) {
		logger.info("--- Completed: " + joinPoint.getSignature().getName() + "----");
	}

	@Before("execution(* com.learning.hotelbooking.*.*(..))")
	public void logMethodAccessBefore(JoinPoint joinPoint) {
		logger.info("--- Starting: " + joinPoint.getSignature().getName() + "---");
	}
}
