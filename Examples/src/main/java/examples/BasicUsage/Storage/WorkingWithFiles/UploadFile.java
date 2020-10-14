package examples.BasicUsage.Storage.WorkingWithFiles;

import java.io.File;
import java.nio.file.Paths;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class UploadFile {

	public static void main(String[] args) {

		FileApi apiInstance = new FileApi(Constants.GetConfiguration());
		try {
			File fileStream = new File(
					Paths.get("src\\main\\resources").toAbsolutePath().toString() + "\\Annotationdocs\\one-page.docx");
			UploadFileRequest request = new UploadFileRequest("Annotationdocs\\one-page1.docx", fileStream,
					Constants.MYStorage);
			FilesUploadResult response = apiInstance.uploadFile(request);
			System.out.println("Expected response type is FilesUploadResult: " + response.getUploaded().size());
		} catch (ApiException e) {
			System.err.println("Exception while calling FileApi:");
			e.printStackTrace();
		}
	}
}