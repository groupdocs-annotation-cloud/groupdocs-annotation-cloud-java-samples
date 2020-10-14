package examples.BasicUsage;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.api.*;

import examples.Constants;

public class GetSupportedFormats {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());

        try {
            FormatsResult response = apiInstance.getSupportedFileFormats();
            System.out.println("GetSupportedFormats: formats count = " + response.getFormats().size());
        } catch (ApiException e) {
            System.err.println("Exception while calling InfoApi:");
            e.printStackTrace();
        }
	}
}
