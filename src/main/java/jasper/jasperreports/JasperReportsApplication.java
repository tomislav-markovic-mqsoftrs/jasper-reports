package jasper.jasperreports;

import jasper.jasperreports.beans.Test;
import jasper.jasperreports.generalWorkflow.GeneralWorkflow;
import jasper.jasperreports.template.TemplateEdit;
import jasper.jasperreports.template.TemplateExport;
import jasper.jasperreports.template.TemplateImport;
import jasper.jasperreports.template.DesignTemplateWorkflow;
import jasper.jasperreports.utils.Consts;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasperReportsApplication {

	public static void main(String[] args) {
		GeneralWorkflow workflow = new GeneralWorkflow();
		workflow.runWorkflow();


//		Test test = new Test();
//		test.runTest();
		SpringApplication.run(JasperReportsApplication.class, args);
	}

}
