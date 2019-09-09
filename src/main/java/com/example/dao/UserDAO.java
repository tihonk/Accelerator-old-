package com.example.dao;

import com.example.HibernateUtil;
import com.example.dto.Role;
import com.example.dto.User;
import com.example.service.PasswordService;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import javax.persistence.EntityManagerFactory;

public class UserDAO
{
    private EntityManagerFactory entityManagerFactory;
   public void save(User user, Role role)
   {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session =sessionFactory.openSession();
       session.getTransaction().begin();

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

    public User receiveUser(long id)
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

    public User receiveUser(String email, String password)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        User user;

        try {
            Query query = session.createQuery("FROM User where EMAIL = :email");
            query.setParameter("email", email);
            List usersList = query.list();
            user = (User) usersList.get(0);
            PasswordService ps = new PasswordService();
            String securityPassword = ps.generateSecurePassword(password, user.getSalt());
            if(securityPassword.equals(user.getPassword()))
            {
                return user;
            }

        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return null;
    }
}
