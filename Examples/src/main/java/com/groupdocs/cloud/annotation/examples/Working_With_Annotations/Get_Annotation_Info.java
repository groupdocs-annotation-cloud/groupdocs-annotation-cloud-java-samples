package com.groupdocs.cloud.annotation.examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.model.AnnotationInfo;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.AnnotationApi;
import com.groupdocs.cloud.annotation.client.ApiException;
import java.util.List;

public class Get_Annotation_Info {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			AnnotationApi apiInstance = Utils.getAnnotationApiInstance();

			// create request instance
			GetImportRequest request = new GetImportRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			List<AnnotationInfo> response = apiInstance.getImport(request);

			// Get and write output
			System.out.println("Annotations count: " + response.size());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}