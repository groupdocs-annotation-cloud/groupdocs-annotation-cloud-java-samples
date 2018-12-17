package com.groupdocs.cloud.annotation.examples.Document_Information;

import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.ImageInfoApi;
import com.groupdocs.cloud.annotation.client.ApiException;

public class Get_Document_Info {

	public static void main(String[] args) {

		try {

			// Create and get ImageInfo api instance
			ImageInfoApi apiInstance = Utils.getImageInfoApiInstance();

			// create request instance
			GetInfoRequest request = new GetInfoRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			DocumentInfo response = apiInstance.getInfo(request);

			// Get and write output
			System.out.println("DocumentInfo: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}