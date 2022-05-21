package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnoSecurityAspect {

	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
	public void VerifyApplicationForm() {
		System.out.println("inna anno before call");
	}

	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	public void processResult() {
		System.out.println("ProcessResults");
	}
	@Before("@annotation(auditable)")
	public void doAccessCheck4(Auditable auditable) {
		System.out.println("do access check 4" +auditable.value());
	}
	
}
