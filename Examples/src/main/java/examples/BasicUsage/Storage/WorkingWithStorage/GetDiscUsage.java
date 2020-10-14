package examples.BasicUsage.Storage.WorkingWithStorage;

import com.groupdocs.cloud.annotation.api.*;
import com.groupdocs.cloud.annotation.client.ApiException;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import examples.Constants;

public class GetDiscUsage {

	public static void main(String[] args) {

		StorageApi apiInstance = new StorageApi(Constants.GetConfiguration());
		try {
			GetDiscUsageRequest request = new GetDiscUsageRequest(Constants.MYStorage);
			DiscUsage response = apiInstance.getDiscUsage(request);
			System.out.println("Expected response type is DiscUsage: " + response.getUsedSize());
		} catch (ApiException e) {
			System.err.println("Exception while calling StorageApi:");
			e.printStackTrace();
		}
	}
}