package cn.itcast.d_auto;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// 创建容器对象
	private ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/d_auto/bean.xml");
	
	@Test
	public void testExecuteAction(){
		// 从容器中获取Action
		UserAction userAction = (UserAction) ac.getBean("userAction");
		userAction.execute();
	}
}
