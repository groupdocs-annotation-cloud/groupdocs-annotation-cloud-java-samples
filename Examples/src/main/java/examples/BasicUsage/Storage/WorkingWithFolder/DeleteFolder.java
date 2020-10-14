package examples.BasicUsage.Storage.WorkingWithFolder;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class DeleteFolder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Constants.GetConfiguration());
		try {
			DeleteFolderRequest request = new DeleteFolderRequest("Annotationdocs\\Annotationdocs1", Constants.MYStorage, true);
			apiInstance.deleteFolder(request);
			System.out
					.println("Expected response type is Void: 'Annotationdocs/Annotationdocs1' folder deleted recusrsively.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}