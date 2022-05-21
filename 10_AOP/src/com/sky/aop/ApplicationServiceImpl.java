package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	
	
	public void processApplication() {
		// TODO Auto-generated method stub
		System.out.println("process application");
	}
	
	public String processApplicationWithAudit() {
		System.out.println("process ApplicationForm in service");
		return "success";
	}
	
}
