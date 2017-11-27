package cn.itcast.b_create_obj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	// 测试：对象创建
	@Test
	public void testIOC() throws Exception{
		// 创建IOC容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/b_create_obj/bean.xml");
		System.out.println("-----容器创建-----");
		// 获取容器中的对象
		User user = (User) ac.getBean("user");
		
		System.out.println(user);
	}
	
	// 测试: 容器中对象的写法
	@Test
	public void testObj() throws Exception{
		// 创建IOC容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("cn/itcast/b_create_obj/bean.xml");
		// 获取容器中的对象
		User user = (User) ac.getBean("1test");
		System.out.println(user);
	}
}
