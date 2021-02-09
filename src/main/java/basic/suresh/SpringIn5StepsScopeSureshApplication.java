package basic.suresh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import basic.suresh.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsScopeSureshApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeSureshApplication.class);

	public static void main(String[] args) {

		ApplicationContext appcontext = SpringApplication.run(SpringIn5StepsScopeSureshApplication.class, args);
		PersonDAO pdao = appcontext.getBean(PersonDAO.class);
		PersonDAO pdao2 = appcontext.getBean(PersonDAO.class);

		LOGGER.info("{}", pdao);
		LOGGER.info("{}", pdao.getJdbcConnection());

		LOGGER.info("{}", pdao2);
		LOGGER.info("{}", pdao2.getJdbcConnection());

	}

}
