package examples.Working_With_Pages;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Get_Pages {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		PreviewApi apiInstance = new PreviewApi(configuration);
		try {
			
			// Create request object.
			GetPagesRequest request = new GetPagesRequest();
			request.setfilePath("Annotationdocs\\ten-pages.docx");
			request.setcountPagesToConvert(1);
			request.setenableCaching(false);
			request.setcacheStoragePath(null);
			request.setwithoutAnnotations(true);

			// Executing api method.
			PageImages response = apiInstance.getPages(request);

			System.out.println("Expected response type is PageImages: " + response);
		} catch (ApiException e) {
			System.err.println("Exception while calling PreviewApi:");
			e.printStackTrace();
		}
	}
}