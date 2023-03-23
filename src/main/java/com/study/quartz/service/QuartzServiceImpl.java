package com.study.quartz.service;

import org.springframework.stereotype.Service;

@Service
public class QuartzServiceImpl implements QuartzService {
 
	@Override
	public void quartzService() {
		try {
			  
			System.out.println( "Quartz Cluster");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
