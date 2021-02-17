package examples.AdvancedUsage.DeleteAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.AnnotationApiLink;
import com.groupdocs.cloud.annotation.model.FileInfo;
import com.groupdocs.cloud.annotation.model.RemoveOptions;
import com.groupdocs.cloud.annotation.model.requests.*;

import java.util.Arrays;

import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class DeleteAnnotation {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {
			
			// Create request object.
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("Annotationdocs\\input.docx");
	
			RemoveOptions options = new RemoveOptions();
			options.setFileInfo(fileInfo);        
			options.setAnnotationIds(Arrays.asList(1, 2, 3));
			options.setOutputPath("Output/output.docx");
	
			RemoveAnnotationsRequest request = new RemoveAnnotationsRequest(options);

			// Executing api method.
			AnnotationApiLink result = apiInstance.removeAnnotations(request);

			System.out.println("DeleteAnnotation: Annotation deleted from document: " + result.getHref());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}