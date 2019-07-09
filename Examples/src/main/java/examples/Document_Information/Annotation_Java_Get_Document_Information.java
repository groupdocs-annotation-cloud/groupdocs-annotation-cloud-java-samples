package examples.Document_Information;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.List;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Get_Document_Information {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		InfoApi apiInstance = new InfoApi(configuration);
		try {
			GetInfoRequest request = new GetInfoRequest("Annotationdocs\\two-page.docx", "");
			
			DocumentInfo response = apiInstance.getInfo(request);

			System.out.println("Expected response type is DocumentInfo: " + response.getPath());
		} catch (ApiException e) {
			System.err.println("Exception while calling InfoApi:");
			e.printStackTrace();
		}
	}
}
