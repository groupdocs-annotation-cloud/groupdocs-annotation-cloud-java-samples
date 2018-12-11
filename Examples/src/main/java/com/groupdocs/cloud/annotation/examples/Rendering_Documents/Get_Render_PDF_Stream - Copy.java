package com.groupdocs.cloud.annotation.examples.Rendering_Documents;

import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.PdfFileApi;
import com.groupdocs.cloud.annotation.client.ApiException;
import java.io.File;

public class Get_Render_PDF_Stream {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			PdfFileApi apiInstance = Utils.getPdfFileApiInstance();

			// create request instance
			GetPdfStreamRequest request = new GetPdfStreamRequest();
			request.setName("one-page.docx");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			File response = apiInstance.getPdfStream(request);

			// Get and write output
			System.out.println("File Name: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}