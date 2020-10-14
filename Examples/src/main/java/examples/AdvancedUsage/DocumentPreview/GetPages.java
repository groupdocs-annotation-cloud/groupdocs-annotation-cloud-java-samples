package examples.AdvancedUsage.DocumentPreview;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class GetPages {

	public static void main(String[] args) {

		PreviewApi apiInstance = new PreviewApi(Constants.GetConfiguration());
		try {
			
			// Create request object.
			GetPagesRequest request = new GetPagesRequest();
			request.setfilePath("Annotationdocs\\one-page.docx");

			// Executing api method.
			PageImages response = apiInstance.getPages(request);

			System.out.println("GetPages: pages count = " + response.getTotalCount());
		} catch (ApiException e) {
			System.err.println("Exception while calling PreviewApi:");
			e.printStackTrace();
		}
	}
}