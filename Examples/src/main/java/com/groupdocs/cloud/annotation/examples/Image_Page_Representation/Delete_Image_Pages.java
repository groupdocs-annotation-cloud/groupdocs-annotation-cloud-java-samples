package com.groupdocs.cloud.annotation.examples.Image_Page_Representation;

import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.ImagePagesApi;
import com.groupdocs.cloud.annotation.client.ApiException;
import java.io.File;

public class Delete_Image_Pages {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			DeletePagesRequest request = new DeletePagesRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");

			// Call api with request
			File response = apiInstance.deletePages(request);

			// Get and write output
			System.out.println("Previously generated images for document pages deleted: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}