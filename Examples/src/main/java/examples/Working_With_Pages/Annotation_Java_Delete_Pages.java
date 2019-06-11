package examples.Working_With_Pages;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Delete_Pages {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		PreviewApi apiInstance = new PreviewApi(configuration);
		try {
			
			// Create request object.
			DeletePagesRequest request = new DeletePagesRequest();
			request.setFilePath("annotations\\ten-pages.docx");

			// Executing api method.
			apiInstance.deletePages(request);

			System.out.println("Expected response type is Void: pages deleted.");
		} catch (ApiException e) {
			System.err.println("Exception while calling PreviewApi:");
			e.printStackTrace();
		}
	}
}