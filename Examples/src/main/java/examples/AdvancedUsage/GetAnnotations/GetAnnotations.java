package examples.AdvancedUsage.GetAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.List;

import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class GetAnnotations {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {

			// Create request object.
			GetImportRequest request = new GetImportRequest();
			request.setfilePath("Annotationdocs\\one-page.docx");

			// Executing api method.
			List<AnnotationInfo> response = apiInstance.getImport(request);

			System.out.println("GetAnnotations: annotations count = " + response.size());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}