package com.saiful.tpg.question.no3.aspect;

import java.time.Instant;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ExecuteTimeAspect {

	long lStartTime;
	long lEndTime;

	@Before("execution(* com.saiful.tpg.question.no3.CustomerService.execute(..))")
	public void beforeExecute(JoinPoint joinPoint) {
		lStartTime = Instant.now().toEpochMilli();

		System.out
				.println("before execute start time " + lStartTime + "MS method=" + joinPoint.getSignature().getName());
	}

	@After("execution(* com.saiful.tpg.question.no3.CustomerService.execute(..))")
	public void logAfter(JoinPoint joinPoint) {
		lEndTime = Instant.now().toEpochMilli();

		long executionTime = lEndTime - lStartTime;
		System.out.println("elapsed time " + executionTime + "MS method= " + joinPoint.getSignature().getName());

	}

}
