package Mypack1;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
public class StoreData {  
  
    public static void main( String[] args )  
    {  
         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction();  
          
        Student e1=new Student();    
           e1.setStdId(1);    
           e1.setFirstName("jogeswara");    
          e1.setLastName("rao");    
   
   
      session.save(e1);  
       
       t.commit();
   
        factory.close();  
        session.close();     
    }  
} 