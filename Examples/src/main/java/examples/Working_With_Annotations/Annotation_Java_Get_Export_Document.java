package examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Get_Export_Document {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		AnnotateApi apiInstance = new AnnotateApi(configuration);
		try {
			
			// Create request object.
			GetExportRequest request = new GetExportRequest();
			request.setFilePath("annotations\\ten-pages.docx");
			request.setPassword(null);
			request.setAnnotatedPages(true);
			request.setAnnotationTypes(null);
			request.setFirstPage(1);
			request.setLastPage(2);

			// Executing api method.
			File response = apiInstance.GetExport(request);

			System.out.println("Expected response type is Stream: Document Length: " + response.getTotalSpace());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}