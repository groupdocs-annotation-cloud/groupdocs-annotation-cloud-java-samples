package examples.Working_With_Files;

import java.io.File;
import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Utils;

public class Annotation_Java_Download_File {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Utils.AppSID, Utils.AppKey);
		try {

			DownloadFileRequest request = new DownloadFileRequest("annotations\\one-page.docx", Utils.MYStorage, null);
			File response = apiInstance.downloadFile(request);
			System.err.println("Expected response type is File: " + response.length());
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}