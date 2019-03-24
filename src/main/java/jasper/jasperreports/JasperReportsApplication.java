package jasper.jasperreports;

import jasper.jasperreports.beans.Test;
import jasper.jasperreports.template.TemplateEdit;
import jasper.jasperreports.template.TemplateExport;
import jasper.jasperreports.template.TemplateImport;
import jasper.jasperreports.template.DesignTemplateWorkflow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JasperReportsApplication {

	public static void main(String[] args) {
		DesignTemplateWorkflow workflow = new DesignTemplateWorkflow(
				new TemplateImport("/home/strudla/Toma/toma.jrxml"),
				new TemplateEdit(),
				new TemplateExport("/home/strudla/Toma/file2.jrxml", "UTF-8"));


		workflow.runWorkflow();


		Test test = new Test();
		test.runTest();
		SpringApplication.run(JasperReportsApplication.class, args);
	}

}
