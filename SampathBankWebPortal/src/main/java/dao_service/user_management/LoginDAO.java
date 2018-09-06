package dao_service.user_management;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernate.HibernateUtil;
import pojo_model.user_management.OnlinePerson;

public class LoginDAO {
	public OnlinePerson authenticate(String username, String password) {
		  Session session = HibernateUtil.openSession();
		  if (session != null) {
		   try {
		    OnlinePerson op = (OnlinePerson) session.get(OnlinePerson.class, username);
		    if (username.equals(op.getUsername()) && password.equals(op.getPassword())) {
			    return op;
		    }
		   } catch (Exception exception) {
		    System.out.println("Exception occred while reading user data: "
		      + exception.getMessage());
		    return null;
		   } finally {
			   session.close();
		   }

		  } else {
		   System.out.println("DB server down.....");
		  }
		  return null;
    }
}
