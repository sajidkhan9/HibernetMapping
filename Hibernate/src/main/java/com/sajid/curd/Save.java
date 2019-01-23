package com.sajid.curd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sajid.Employee;
import com.sajid.Name;
import com.sajid.TechName;
import com.sajid.Technology;

public class Save {
		public void Save(SessionFactory sf)
		{
			Session session = sf.getCurrentSession();
			session.beginTransaction();
			Technology tech = new Technology(4,"JAVA");
			TechName tn = new TechName(105,"anmobl","ajhknil.com",tech);
			session.save(tn);
			session.getTransaction().commit();

		}
}
