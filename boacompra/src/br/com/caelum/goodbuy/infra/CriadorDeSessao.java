package br.com.caelum.goodbuy.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * 
 * @author 805839
 *
 *classe produtora de sessão
 *
 */
public class CriadorDeSessao {

	public static Session getSession() {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		return session;
	}

}
