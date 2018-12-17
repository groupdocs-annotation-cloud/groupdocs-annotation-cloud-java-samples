package com.groupdocs.cloud.annotation.examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.AnnotationApi;
import com.groupdocs.cloud.annotation.client.ApiException;
import java.io.File;

public class Delete_Remove_Annotation {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			AnnotationApi apiInstance = Utils.getAnnotationApiInstance();

			// create request instance
			DeleteCleanDocumentRequest request = new DeleteCleanDocumentRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			File response = apiInstance.deleteCleanDocument(request);

			// Get and write output
			System.out.println("Annotations removed from document: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}