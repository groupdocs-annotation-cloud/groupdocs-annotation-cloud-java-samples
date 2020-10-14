package examples.BasicUsage.Storage.WorkingWithFiles;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class MoveFile {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Constants.GetConfiguration());
		try {

			MoveFileRequest request = new MoveFileRequest("Annotationdocs\\one-page.docx", "Annotationdocs1\\one-page1.docx",
					Constants.MYStorage, Constants.MYStorage, null);
			apiInstance.moveFile(request);
			System.out.println(
					"Expected response type is Void: 'Annotationdocs/one-page.docx' file moved to 'Annotationdocs1/one-page1.docx'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}