package examples.AdvancedUsage.AddAnnotations;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.AnnotationInfo.TypeEnum;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.util.Arrays;
import com.groupdocs.cloud.annotation.api.*;
import examples.Constants;

public class AddTextFieldAnnotation {

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
			annotations[0].setOpacity(0.7);
			annotations[0].setType(TypeEnum.TEXTFIELD);
			annotations[0].setText("Text field text");
			annotations[0].setCreatorName("Anonym A.");

			// Create request object.
			FileInfo fileInfo = new FileInfo();
			fileInfo.setFilePath("Annotationdocs\\one-page.docx");
	
			AnnotateOptions options = new AnnotateOptions();
			options.setFileInfo(fileInfo);
			options.setAnnotations(Arrays.asList(annotations));
			options.setOutputPath("Output/one-page-annotated.docx");
	
			AnnotateRequest request = new AnnotateRequest(options);

			// Executing api method.
			AnnotationApiLink result = apiInstance.annotate(request);

			System.out.println("AddTextFieldAnnotation: TextField Annotation added: " + result.getTitle());
		} catch (ApiException e) {
			System.err.println("Exception while calling AnnotateApi:");
			e.printStackTrace();
		}
	}
}