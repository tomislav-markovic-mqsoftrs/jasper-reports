package jasper.jasperreports;


import jasper.jasperreports.generalWorkflow.GeneralWorkflow;
import net.sf.jasperreports.view.JasperDesignViewer;
import net.sf.jasperreports.view.JasperViewer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasperReportsApplication {

	public static void main(String[] args) {
		GeneralWorkflow workflow = new GeneralWorkflow();
		workflow.runWorkflow();

		SpringApplication.run(JasperReportsApplication.class, args);
	}

}
