package examples.BasicUsage.Storage.WorkingWithFolder;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class MoveFolder {

	public static void main(String[] args) {

		FolderApi apiInstance = new FolderApi(Constants.GetConfiguration());
		try {
			MoveFolderRequest request = new MoveFolderRequest("Annotationdocs1", "Annotationdocs\\Annotationdocs1",
					Constants.MYStorage, Constants.MYStorage);
			apiInstance.moveFolder(request);
			System.out.println(
					"Expected response type is Void: 'Annotationdocs1' folder moved to 'Annotationdocs/Annotationdocs1'.");
		} catch (ApiException e) {
			System.err.println("Exception while calling FolderApi:");
			e.printStackTrace();
		}
	}
}