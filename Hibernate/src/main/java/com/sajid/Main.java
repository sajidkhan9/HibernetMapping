package com.sajid;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;
import com.sajid.curd.Delete1;
import com.sajid.curd.Save;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration()
				.configure()
				//.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(TechName.class)
				.addAnnotatedClass(Technology.class)
				.buildSessionFactory();
		
		Save  sobj = new Save();
		sobj.Save(sf);
		//Delete1 dobj = new Delete1();
		//dobj.delet(sf);
		
		
	}

}
