package cn.itcast.e_anno2;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("userAction")// 加入IOC容器

//@Component

@Controller  // 控制层的组件
public class UserAction {

	//@Resource(name = "userService")
	
	@Resource
	private UserService userService;
	
	public String execute(){
		userService.save();
		return null;
	}
}
