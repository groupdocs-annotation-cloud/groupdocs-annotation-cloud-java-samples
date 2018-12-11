package com.groupdocs.cloud.annotation.examples;
import com.groupdocs.cloud.annotation.api.AnnotationApi;
import com.groupdocs.cloud.annotation.api.ImageInfoApi;
import com.groupdocs.cloud.annotation.api.ImagePagesApi;
import com.groupdocs.cloud.annotation.api.PdfFileApi;

public class Utils {

	// TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free
	// registration is required).

	public static String AppSID = "XXXXX-XXXXX-XXXXX";
	public static String AppKey = "XXXXXXXX";
	public static String BaseApiUrl = "https://api.groupdocs.cloud";

	public static AnnotationApi getAnnotationApiInstance()
	{
		return new AnnotationApi(AppSID, AppKey);
	}
	
	public static ImageInfoApi getImageInfoApiInstance()
	{
		return new ImageInfoApi(AppSID, AppKey);
	}
	
	public static ImagePagesApi getImagePagesApiInstance()
	{
		return new ImagePagesApi(AppSID, AppKey);
	}
	
	public static PdfFileApi getPdfFileApiInstance()
	{
		return new PdfFileApi(AppSID, AppKey);
	}
}