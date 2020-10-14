package examples.BasicUsage.Storage.WorkingWithFolder;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class CopyFolder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Constants.GetConfiguration());
		try {
			CopyFolderRequest request = new CopyFolderRequest("Annotationdocs", "Annotationdocs1", Constants.MYStorage,
					Constants.MYStorage);
			apiInstance.copyFolder(request);
			System.out.println("Expected response type is Void: 'Annotationdocs' folder copied as 'Annotationdocs1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}