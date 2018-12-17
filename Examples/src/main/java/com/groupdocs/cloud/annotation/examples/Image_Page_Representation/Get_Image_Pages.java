package com.groupdocs.cloud.annotation.examples.Image_Page_Representation;

import com.groupdocs.cloud.annotation.model.ImagePages;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.ImagePagesApi;
import com.groupdocs.cloud.annotation.client.ApiException;

public class Get_Image_Pages {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			GetPagesRequest request = new GetPagesRequest();
			request.setName("two-page.docx");
			request.setFolder("annotationdocs");

			// Call api with request
			ImagePages response = apiInstance.getPages(request);

			// Get and write output
			System.out.println("Pages count: " + response.getEntries().size());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}