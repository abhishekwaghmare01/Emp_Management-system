package com.MyPackage.Emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session ss = sf.openSession();
        
        ss.beginTransaction();
        
        Salary sl = new Salary(3, 1000);
        ss.persist(sl);
        
        Salary sl1 = ss.get(Salary.class, 3);
        
        Employe emp = new Employe(3, "Software","2025-11-12","Yash",sl1);
        ss.persist(emp);
        																																																																																																																																																																																																																			
        
        ss.getTransaction().commit();
        ss.close();
    }
}
