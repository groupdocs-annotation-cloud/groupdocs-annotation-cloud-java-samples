package examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Get_Annotation {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		AnnotateApi apiInstance = new AnnotateApi(configuration);
		try {
			
			// Create request object.
			GetImportRequest request = new GetImportRequest();
			request.setFilePath("annotations\\ten-pages.docx");

			// Executing api method.
			List<AnnotationInfo> response = apiInstance.GetExport(request);

			System.out.println("Expected response type is List<AnnotationInfo>: " + response);
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}