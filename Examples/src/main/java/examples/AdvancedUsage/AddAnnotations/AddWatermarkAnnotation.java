package examples.AdvancedUsage.AddAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.Arrays;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class AddWatermarkAnnotation {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {

			// Create annotation/s.
			AnnotationInfo[] annotations = new AnnotationInfo[1];
			annotations[0] = new AnnotationInfo();

			Point pt = new Point();
			pt.setX(1.0);
			pt.setY(1.0);
			annotations[0].setAnnotationPosition(pt);

			Rectangle r = new Rectangle();
			r.setX(100.0);
			r.setY(100.0);
			r.setWidth(200.0);
			r.setHeight(100.0);

			annotations[0].setBox(r);
			annotations[0].setPageNumber(0);
			annotations[0].setFontColor(1201033);
			annotations[0].setFontSize(12.0);
			annotations[0].setAngle(75.0);
			annotations[0].setOpacity(0.7);
			annotations[0].setType(TypeEnum.WATERMARK);
			annotations[0].setText("This is watermark annotation");
			annotations[0].setCreatorName("Anonym A.");

			// Create request object.
			PostAnnotationsRequest request = new PostAnnotationsRequest("Annotationdocs\\one-page.docx", Arrays.asList(annotations));

			// Executing api method.
			apiInstance.postAnnotations(request);

			System.out.println("AddWatermarkAnnotation: Watermark Annotation added.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}