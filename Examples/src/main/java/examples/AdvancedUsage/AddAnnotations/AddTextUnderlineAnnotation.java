package examples.AdvancedUsage.AddAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.Arrays;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class AddTextUnderlineAnnotation {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {

			// Create annotation/s.
			AnnotationInfo[] annotations = new AnnotationInfo[1];
			annotations[0] = new AnnotationInfo();

			Point[] pt = new Point[4];
			pt[0] = new Point();
			pt[0].setX(80.0);
			pt[0].setY(730.0);
			pt[1] = new Point();
			pt[1].setX(240.0);
			pt[1].setY(730.0);
			pt[2] = new Point();
			pt[2].setX(80.0);
			pt[2].setY(650.0);							
			pt[3] = new Point();
			pt[3].setX(240.0);
			pt[3].setY(650.0);				
			annotations[0].setPoints(Arrays.asList(pt));

			annotations[0].setPageNumber(0);
			annotations[0].setFontColor(1201033);
			annotations[0].setType(TypeEnum.TEXTUNDERLINE);
			annotations[0].setText("This is text underline annotation");
			annotations[0].setCreatorName("Anonym A.");

			// Create request object.
			PostAnnotationsRequest request = new PostAnnotationsRequest("Annotationdocs\\one-page.docx", Arrays.asList(annotations));

			// Executing api method.
			apiInstance.postAnnotations(request);

			System.out.println("AddTextUnderlineAnnotation: TextUnderline Annotation added.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}