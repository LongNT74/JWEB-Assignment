package fa.training.common;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import fa.training.entities.Account;
import fa.training.entities.Employee;

public class HibernateUtils {
	private static final SessionFactory FACTORY;
	
	static {
		Configuration conf = new Configuration();
		Properties props = new Properties();
		props.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
		props.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
		props.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=HRM");
		props.put(Environment.USER, "sa");
		props.put(Environment.PASS, "123456");
		props.put(Environment.SHOW_SQL, "true");
		
		conf.setProperties(props);
		conf.addAnnotatedClass(Account.class);
		conf.addAnnotatedClass(Employee.class);
		
		ServiceRegistry registry = new StandardServiceRegistryBuilder()
				.applySettings(conf.getProperties()).build();
		FACTORY = conf.buildSessionFactory(registry);
	}
	
	public static SessionFactory getFactory() {
		return FACTORY;
	}
}
