import dto.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("C001","Mindula","Matara","mindula@gmail.com");
        Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class);
        SessionFactory secFactory = config.buildSessionFactory();
        Session session = secFactory.openSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();

    }

}
