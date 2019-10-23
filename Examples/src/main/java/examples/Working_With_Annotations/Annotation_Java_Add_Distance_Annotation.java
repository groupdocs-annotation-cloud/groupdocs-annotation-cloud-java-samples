package examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.Arrays;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Add_Distance_Annotation {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		AnnotateApi apiInstance = new AnnotateApi(configuration);
		try {

			// Create annotation/s.
			AnnotationInfo[] annotations = new AnnotationInfo[1];
			annotations[0] = new AnnotationInfo();

			Point pt = new Point();
			pt.setX(852.0);
			pt.setY(59.388262910798119);
			annotations[0].setAnnotationPosition(pt);

			Rectangle r = new Rectangle();
			r.setX(375.89276123046875);
			r.setY(59.388262910798119);
			r.setWidth(88.7330551147461);
			r.setHeight(37.7290153503418);

			annotations[0].setBox(r);
			annotations[0].setPageNumber(0);
			annotations[0].setPenColor(1201033);
			annotations[0].setPenStyle(0);
			annotations[0].setPenWidth(1);
			annotations[0].setBackgroundColor(65535);
			annotations[0].setOpacity(0.7);
			annotations[0].setType(TypeEnum.DISTANCE);
			annotations[0].setText("This is distance annotation");
			annotations[0].setCreatorName("Anonym A.");

			// Create request object.
			PostAnnotationsRequest request = new PostAnnotationsRequest("Annotationdocs\\ten-pages.docx", Arrays.asList(annotations));

			// Executing api method.
			apiInstance.postAnnotations(request);

			System.out.println("Expected response type is void: Distance Annotation added.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}