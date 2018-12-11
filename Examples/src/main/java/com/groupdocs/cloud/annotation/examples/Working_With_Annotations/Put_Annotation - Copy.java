package com.groupdocs.cloud.annotation.examples.Working_With_Annotations;

import com.groupdocs.cloud.annotation.model.AnnotationInfo;
import com.groupdocs.cloud.annotation.model.AnnotationReplyInfo;
import com.groupdocs.cloud.annotation.model.Point;
import com.groupdocs.cloud.annotation.model.Rectangle;
import com.groupdocs.cloud.annotation.model.requests.*;
import com.groupdocs.cloud.annotation.examples.Utils;
import com.groupdocs.cloud.annotation.api.AnnotationApi;
import com.groupdocs.cloud.annotation.client.ApiException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.threeten.bp.OffsetDateTime;

public class Put_Annotation {

	public static void main(String[] args) {

		try {

			// Create and get annotation api instance
			AnnotationApi apiInstance = Utils.getAnnotationApiInstance();

	        // create request instance
			PutExportRequest request = new PutExportRequest();
			request.setName("one-page.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

	        List<AnnotationInfo> annotations = new ArrayList<AnnotationInfo>();
	        
	        AnnotationInfo textAnnotation = new AnnotationInfo();
	        textAnnotation.annotationPosition(new Point(852.0, 154.31));
	        
	        List<AnnotationReplyInfo> replies = new ArrayList<AnnotationReplyInfo>();

	        AnnotationReplyInfo replyInfo = new AnnotationReplyInfo();
	        replyInfo.setMessage("reply text");
	        replyInfo.setRepliedOn(OffsetDateTime.now());
	        replyInfo.setUserName("Admin");
	        replies.add(replyInfo);
	        replyInfo = new AnnotationReplyInfo();
	        replyInfo.setMessage("reply2 text");
	        replyInfo.setRepliedOn(OffsetDateTime.now());
	        replyInfo.setUserName("Commentator");
	        replies.add(replyInfo);
	        
	        textAnnotation.replies(replies);
	        textAnnotation.setBox(new Rectangle(173.29, 154.31, 142.5, 9.0));
	        textAnnotation.setPageNumber(0);
	        textAnnotation.setSvgPath("[{\"x\":173.2986,\"y\":687.5769},{\"x\":315.7985,\"y\":687.5769},{\"x\":173.2986,\"y\":678.5769},{\"x\":315.7985,\"y\":678.5769}]");
	        textAnnotation.setType(AnnotationInfo.TypeEnum.TEXT);
	        textAnnotation.setCreatorName("Anonym A.");

	        annotations.add(textAnnotation);
	        request.setBody(annotations);

			// Call api with request
			File response = apiInstance.putExport(request);

			// Get and write output
			System.out.println("Annotations count: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
}