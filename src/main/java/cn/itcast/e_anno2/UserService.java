package cn.itcast.e_anno2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component("userService") // userService加入ioc容器

//@Component

@Service  // 表示业务逻辑层的组件
public class UserService {

	// 会从IOC容器中找userDao对象，注入到当前字段
	/*
	 * <bean id="" class=""> 
	 *	  <property name="userDao" ref="userDao" />    @Resource相当于这里的配置
	 * </bean>
	 */
	
	//@Resource(name = "userDao")// 根据名称查找
	
	@Resource //  根据类型查找 【在容器中要确保该类型只有一个变量】
	private UserDao userDao;// 去容器中招UserDao类型的变量，找到后就赋值
	
	public void save(){
		userDao.save();
	}
}
