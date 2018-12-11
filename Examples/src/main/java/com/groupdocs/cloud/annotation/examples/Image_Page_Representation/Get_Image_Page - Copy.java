package com.groupdocs.cloud.annotation.examples.Image_Page_Representation;

import com.groupdocs.cloud.annotation.model.ImagePage;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.ImagePagesApi;
import com.groupdocs.cloud.annotation.client.ApiException;

public class Get_Image_Page {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			GetPageRequest request = new GetPageRequest();
			request.setName("two-page.docx");
			request.setFolder("annotationdocs");
			request.setPageNumber(0);

			// Call api with request
			ImagePage response = apiInstance.getPage(request);

			// Get and write output
			System.out.println("Page number: " + response.getNumber());
			System.out.println("Page link: " + response.getLink().getHref());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}