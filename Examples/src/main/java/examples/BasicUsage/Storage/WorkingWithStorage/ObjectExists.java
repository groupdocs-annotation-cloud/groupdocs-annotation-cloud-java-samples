package examples.BasicUsage.Storage.WorkingWithStorage;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class ObjectExists {

	public static void main(String[] args) {

		StorageApi apiInstance = new StorageApi(Constants.GetConfiguration());
		try {
			ObjectExistsRequest request = new ObjectExistsRequest("Annotationdocs\\one-page.docx", Constants.MYStorage, null);
			ObjectExist response = apiInstance.objectExists(request);
			System.out.println("Expected response type is ObjectExist: " + response.getExists());
		} catch (ApiException e) {
			System.err.println("Exception while calling StorageApi:");
			e.printStackTrace();
		}
	}
}