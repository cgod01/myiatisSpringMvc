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
        //����id=1���û���ѯ���������ݿ��е���������Ըĳ����Լ���.
        System.out.println("�õ��û�id=1���û���Ϣ");
        //�õ������б����
       System.out.println("�õ��û�idΪ1�����������б�");
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
