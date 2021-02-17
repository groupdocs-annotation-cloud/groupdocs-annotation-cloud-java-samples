package examples;

import examples.AdvancedUsage.AddAnnotations.AddAreaAnnotation;
import examples.AdvancedUsage.AddAnnotationsDirect.AddAnnotationsDirect;
import examples.AdvancedUsage.DeleteAnnotations.DeleteAnnotation;
import examples.AdvancedUsage.DocumentPreview.DeletePages;
import examples.AdvancedUsage.DocumentPreview.GetPages;
import examples.AdvancedUsage.ExtractAnnotations.ExtractAnnotations;
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
		ExtractAnnotations.main(args);
		AddAnnotationsDirect.main(args);
		DeleteAnnotation.main(args);
		GetPages.main(args);
		DeletePages.main(args);


		System.out.println("Completed");
	}	
}