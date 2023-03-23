package com.study.quartz.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class QuartzJob extends QuartzJobBean {

	private QuartzService service;
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try { 
			service = ((ApplicationContext) context.getScheduler().getContext().get("applicationContext")).getBean(QuartzService.class);
			service.quartzService();
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
