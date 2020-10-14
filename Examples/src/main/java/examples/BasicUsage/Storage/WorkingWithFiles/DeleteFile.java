package examples.BasicUsage.Storage.WorkingWithFiles;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class DeleteFile {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Constants.GetConfiguration());
		try {

			DeleteFileRequest request = new DeleteFileRequest("Annotationdocs1\\one-page1.docx", Constants.MYStorage, null);
			apiInstance.deleteFile(request);
			System.out.println("Expected response type is Void: 'Annotationdocs1/one-page1.docx' deleted.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}