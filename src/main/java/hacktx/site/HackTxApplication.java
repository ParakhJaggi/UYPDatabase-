package hacktx.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by jlutteringer on 8/22/17.
 */
@SpringBootApplication
public class HackTxApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HackTxApplication.class, args);

		JDBC j = new JDBC();
		j.DerbyTest();

	}
}
