

import com.example.dto.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class Test
{
    public static void main(String[] args)
    {
        SessionFactory sessionFactory = com.example.HibernateUtil.getSessionFactory();
        Session session =sessionFactory.openSession();
        List<User> users = null;


        try {
            session.beginTransaction();
            Query query = session.createQuery("FROM com.example.dto.User");
            users = query.list();

            for (User user: users) {
                System.out.println(user.toString());
            }


//            Eny code;

//            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally
        {
            session.close();
            sessionFactory.close();
        }
    }
}
