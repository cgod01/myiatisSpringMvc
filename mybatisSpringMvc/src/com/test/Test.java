package com.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.UserTable;
import com.service.IUserService;
public class Test {
	private static ApplicationContext ctx;  
    static 
    {  
        ctx = new ClassPathXmlApplicationContext("config/applicationContext.xml"); 
    }        
      
    public static void main(String[] args)  
    {  
    	IUserService mapper = (IUserService)ctx.getBean("userServiceBean"); 
        //测试id=1的用户查询，根据数据库中的情况，可以改成你自己的.
        System.out.println("得到用户id=1的用户信息");
        //得到文章列表测试
       System.out.println("得到用户id为1的所有文章列表");
       List<UserTable> articles = mapper.mytables();
//      System.out.println(articles.size());
//        for(Article article:articles){
//            System.out.println(article.getId());
//        }
       for (UserTable userTable : articles) {
    	   System.out.println(userTable.getName()+","+userTable.getId()+","+userTable.getPassword());
	}
    }  

}
