package cn.itcasst.c_property;

public class User {

	private int id;
	private String name;

	public User() {
		System.out.println("------User对象创建【无参数构造器】------");
	}

	public User(int id, String name) {
		System.out.println("-----User对象创建【带参数构造器】--------");
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	////////////////// --> 通过容器注入属性值
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	// //--> 通过容器注入属性值
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public void init_user() {
		System.out.println("创建对象之后，初始化");
	}

	public void destroy_user() {
		System.out.println("IOC容器销毁，user对象回收!");
	}

}
