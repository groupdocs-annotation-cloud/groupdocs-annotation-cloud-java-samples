package examples.AdvancedUsage.ExportDocumentWithAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class GetExportDocument {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {
			
			// Create request object.
			GetExportRequest request = new GetExportRequest();
			request.setfilePath("Annotationdocs\\one-page.docx");

			// Executing api method.
			File response = apiInstance.getExport(request);

			System.out.println("GetExportDocument: Document Length: " + response.getTotalSpace());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}