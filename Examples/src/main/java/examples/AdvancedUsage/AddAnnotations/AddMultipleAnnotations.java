package examples.AdvancedUsage.AddAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.PenStyleEnum;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.Arrays;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class AddMultipleAnnotations {

	public static void main(String[] args) {

		AnnotateApi apiInstance = new AnnotateApi(Constants.GetConfiguration());
		try {

			// Create annotation/s.
			AnnotationInfo[] annotations = new AnnotationInfo[4];
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
			annotations[0].setPenColor(1201033);
			annotations[0].setPenStyle(PenStyleEnum.SOLID);
			annotations[0].setPenWidth(1);
			annotations[0].setOpacity(0.7);
			annotations[0].setType(TypeEnum.DISTANCE);
			annotations[0].setText("This is distance annotation");
			annotations[0].setCreatorName("Anonym A.");

			annotations[1] = new AnnotationInfo();

			annotations[1].setAnnotationPosition(pt);
			annotations[1].setBox(r);
			annotations[1].setPageNumber(2);
			annotations[1].setPenColor(1201033);
			annotations[1].setPenStyle(PenStyleEnum.SOLID);
			annotations[1].setPenWidth(1);
			annotations[0].setOpacity(0.7);
			annotations[1].setType(TypeEnum.AREA);
			annotations[1].setText("This is area annotation");
			annotations[1].setCreatorName("Anonym A.");

			annotations[2] = new AnnotationInfo();
			annotations[2].setAnnotationPosition(pt);
			annotations[2].setBox(r);
			annotations[2].setPageNumber(4);
			annotations[0].setOpacity(0.7);
			annotations[2].setType(TypeEnum.POINT);
			annotations[0].setText("This is point annotation");
			annotations[2].setCreatorName("Anonym A.");

			annotations[3] = new AnnotationInfo();
			annotations[3].setAnnotationPosition(pt);
			annotations[3].setBox(r);
			annotations[3].setPageNumber(5);
			annotations[3].setPenColor(1201033);
			annotations[3].setPenStyle(PenStyleEnum.SOLID);
			annotations[3].setPenWidth(1);
			annotations[0].setOpacity(0.7);
			annotations[3].setType(TypeEnum.ARROW);
			annotations[0].setText("This is arrow annotation");
			annotations[3].setCreatorName("Anonym A.");

			// Create request object.
			PostAnnotationsRequest request = new PostAnnotationsRequest("Annotationdocs\\ten-pages.docx", Arrays.asList(annotations));

			// Executing api method.
			apiInstance.postAnnotations(request);

			System.out.println("AddMultipleAnnotations: Multiple Annotation added.");
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}