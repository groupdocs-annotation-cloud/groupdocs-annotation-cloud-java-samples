package examples.AdvancedUsage.DocumentPreview;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.FileInfo;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class DeletePages {

	public static void main(String[] args) {

		PreviewApi apiInstance = new PreviewApi(Constants.GetConfiguration());
		try {
			
			// Create request object.
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("Annotationdocs\\one-page.docx");			
			DeletePagesRequest request = new DeletePagesRequest(fileInfo);

			// Executing api method.
			apiInstance.deletePages(request);

			System.out.println("DeletePages: pages deleted.");
		} catch (ApiException e) {
			System.err.println("Exception while calling PreviewApi:");
			e.printStackTrace();
		}
	}
}