package com.module.Test_Project;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.module.Util.HibernateUtil;
import com.module.beans.Bill;
import com.module.beans.BillData;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session Session=HibernateUtil.getSessionFactory().openSession();
        Transaction tr=Session.beginTransaction(); 
       BillData n=new BillData();
      n.setId(1);
      n.setName("pugal");
      Bill b=new Bill();
      b.setId(1);
      b.setName("Pugal");
      n.setData_bill_id(b);
        Session.save(n);
        tr.commit();
        
        
        
    }
}
