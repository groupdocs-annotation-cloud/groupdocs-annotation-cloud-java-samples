package examples.AdvancedUsage.DeleteAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class DeleteAnnotation {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {
			
			// Create request object.
			DeleteAnnotationsRequest request = new DeleteAnnotationsRequest("Annotationdocs\\one-page.docx");

			// Executing api method.
			apiInstance.deleteAnnotations(request);

			System.out.println("DeleteAnnotation: Annotation deleted from document.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}