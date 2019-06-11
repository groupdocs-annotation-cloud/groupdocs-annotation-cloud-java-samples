package examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Add_Annotation {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		AnnotateApi apiInstance = new AnnotateApi(configuration);
		try {
			
			// Create annotation/s.
			AnnotationInfo[] annotations = new AnnotationInfo[1];
			annotations[0] = new AnnotationInfo();
			annotations[0].setAnnotationPosition(GetPoint());
			annotations[0].setBox(GetRectangle());
			annotations[0].setPageNumber(0);
			annotations[0].setPenColor(1201033);
			annotations[0].setPenStyle(0);
			annotations[0].setPenWidth(1);
			annotations[0].setType(TypeEnum.AREA);
			annotations[0].setCreatorName("Anonym A.");

			// Create request object.
			PostAnnotationsRequest request = new PostAnnotationsRequest();
			request.setFilePath("Annotationdocs\\ten-pages.docx");
			requestsetAnnotations(Arrays.asList(annotations)); 			

			// Executing api method.
			apiInstance.postAnnotations(request);

			System.out.println("Expected response type is void: Annotation added.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}