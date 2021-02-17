package examples.AdvancedUsage.ExtractAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.List;

import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class ExtractAnnotations {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {

			// Create request object.
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("Annotationdocs\\input.docx");

			ExtractRequest request = new ExtractRequest();
			request.setfileInfo(fileInfo);

			// Executing api method.
			List<AnnotationInfo> response = apiInstance.extract(request);

			System.out.println("GetAnnotations: annotations count = " + response.size());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}