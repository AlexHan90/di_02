package test02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String path = 
				"classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext(path);
		//sc1111
		SaveClass sc = ctx.getBean("sc1111",SaveClass.class);
		
		sc.setNum1(100);
		sc.setOp("*");
		sc.setNum2(200);
		
		sc.operationClass();
		sc.printClass();
	}
}








