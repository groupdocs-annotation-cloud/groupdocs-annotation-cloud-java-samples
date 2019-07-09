package examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.client.*;
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
			request.setfilePath("Annotationdocs\\one-page-annotated.pdf");
			request.setpassword(null);
			request.setannotatedPages(true);
			request.setannotationTypes(null);
			request.setfirstPage(1);
			request.setlastPage(2);

			// Executing api method.
			File response = apiInstance.getExport(request);

			System.out.println("Expected response type is Stream: Document Length: " + response.getTotalSpace());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}