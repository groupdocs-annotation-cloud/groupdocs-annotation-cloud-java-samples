package examples.BasicUsage.Storage.WorkingWithStorage;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class StorageExists {

	public static void main(String[] args) {

		StorageApi apiInstance = new StorageApi(Constants.GetConfiguration());
		try {
			StorageExistsRequest request = new StorageExistsRequest(Constants.MYStorage);
			StorageExist response = apiInstance.storageExists(request);
			System.out.println("Expected response type is StorageExist: " + response.getExists());
		} catch (ApiException e) {
			System.err.println("Exception while calling StorageApi:");
			e.printStackTrace();
		}
	}
}