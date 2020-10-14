package examples;

import examples.AdvancedUsage.AddAnnotations.AddAreaAnnotation;
import examples.AdvancedUsage.DeleteAnnotations.DeleteAnnotation;
import examples.AdvancedUsage.DocumentPreview.DeletePages;
import examples.AdvancedUsage.DocumentPreview.GetPages;
import examples.AdvancedUsage.ExportDocumentWithAnnotations.GetExportDocument;
import examples.AdvancedUsage.GetAnnotations.GetAnnotations;
import examples.BasicUsage.*;


public class RunExamples {

	public static void main(String[] args) {

		// Upload files
		UploadResources.main(args);

		// Basic usage examples

		GetSupportedFormats.main(args);
		GetDocumentInfo.main(args);

		// Advanced examples

		AddAreaAnnotation.main(args);
		GetAnnotations.main(args);
		GetExportDocument.main(args);
		DeleteAnnotation.main(args);
		GetPages.main(args);
		DeletePages.main(args);


		System.out.println("Completed");
	}	
}