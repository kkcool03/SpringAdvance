import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sky.aop.ApplicationService;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		
		
//		ApplicationService applicationService = (ApplicationService) beanFactory.getBean(ApplicationService.class);
//		System.out.println(applicationService);
//		applicationService.processApplication();
		
		ApplicationService applicationService2 = (ApplicationService) beanFactory.getBean(ApplicationService.class);
		applicationService2.processApplicationWithAudit();
		System.out.println(applicationService2);
	}
}
