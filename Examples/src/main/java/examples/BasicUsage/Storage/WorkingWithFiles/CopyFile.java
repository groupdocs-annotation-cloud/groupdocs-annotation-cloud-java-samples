package examples.BasicUsage.Storage.WorkingWithFiles;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class CopyFile {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Constants.GetConfiguration());
		try {

			CopyFileRequest request = new CopyFileRequest("Annotationdocs\\one-page.docx",
					"Annotationdocs\\one-page-copied.docx", Constants.MYStorage, Constants.MYStorage, null);
			apiInstance.copyFile(request);
			System.out.println(
					"Expected response type is Void: 'Annotationdocs/one-page1.docx' file copied as 'Annotationdocs/one-page-copied.docx'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}