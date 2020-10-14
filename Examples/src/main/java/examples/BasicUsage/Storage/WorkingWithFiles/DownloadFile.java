package examples.BasicUsage.Storage.WorkingWithFiles;

import java.io.File;
import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class DownloadFile {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Constants.GetConfiguration());
		try {

			DownloadFileRequest request = new DownloadFileRequest("Annotationdocs\\one-page.docx", Constants.MYStorage, null);
			File response = apiInstance.downloadFile(request);
			System.err.println("Expected response type is File: " + response.length());
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}