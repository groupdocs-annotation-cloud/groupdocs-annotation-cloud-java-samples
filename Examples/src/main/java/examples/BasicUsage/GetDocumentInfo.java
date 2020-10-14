package examples.BasicUsage;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.GetInfoRequest;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class GetDocumentInfo {

	public static void main(String[] args) {

		InfoApi apiInstance = new InfoApi(Constants.GetConfiguration());

        try {

			GetInfoRequest request = new GetInfoRequest("Annotationdocs\\one-page.docx", null);

			DocumentInfo response = apiInstance.getInfo(request);
			System.out.println("GetDocumentInfo: pages count = " + response.getPages().size());
        } catch (ApiException e) {
            System.err.println("Exception while calling InfoApi:");
            e.printStackTrace();
        }
	}
}