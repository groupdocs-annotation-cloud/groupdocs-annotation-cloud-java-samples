package examples.BasicUsage.Storage.WorkingWithFolder;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class CreateFolder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Constants.GetConfiguration());
		try {
			CreateFolderRequest request = new CreateFolderRequest("Annotationdocs", Constants.MYStorage);
			apiInstance.createFolder(request);
			System.out.println("Expected response type is Void: 'Annotationdocs' folder created.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}