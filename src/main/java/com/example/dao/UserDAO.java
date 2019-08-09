package com.example.dao;

import com.example.HibernateUtil;
import com.example.dto.Role;
import com.example.dto.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManagerFactory;

public class UserDAO
{
    private EntityManagerFactory entityManagerFactory;
   public void save(User user, Role role)
   {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session =sessionFactory.openSession();
       session.beginTransaction();

       try {

           session.save(role);
           session.save(user);

           session.getTransaction().commit();
       } catch (Exception e) {
           session.getTransaction().rollback();
           e.printStackTrace();
       } finally
       {
           /*session.close();
           HibernateUtil.shutdown();*/
       }

   }

    public User receiveUser(int id)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        User user = new User();

        try {
            user = session.get(User.class, id);
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally
        {
            /*session.close();
            HibernateUtil.shutdown();*/
        }
        return user;
    }
}
