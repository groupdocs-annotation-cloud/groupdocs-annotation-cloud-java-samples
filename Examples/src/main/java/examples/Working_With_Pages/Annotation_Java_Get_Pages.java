package examples.Working_With_Pages;

import com.groupdocs.cloud.annotation.client.*;
import com.groupdocs.cloud.annotation.model.*;
import com.groupdocs.cloud.annotation.model.requests.*;
import java.io.File;
import com.groupdocs.cloud.annotation.client.Configuration;
import com.groupdocs.cloud.annotation.api.*;
import examples.Utils;

public class Annotation_Java_Get_Pages {

	public static void main(String[] args) {

		Configuration configuration = new Configuration(Utils.AppSID, Utils.AppKey);
		PreviewApi apiInstance = new PreviewApi(configuration);
		try {
			
			// Create request object.
			GetPagesRequest request = new GetPagesRequest();
			request.setFilePath("annotations\\ten-pages.docx");
			request.setCountPagesToConvert(1);
			request.setEnableCaching(false);
			request.setCacheStoragePath(null);
			request.setWithoutAnnotations(true);

			// Executing api method.
			PageImages response = apiInstance.getPages(request);

			System.out.println("Expected response type is PageImages: " + response);
		} catch (ApiException e) {
			System.err.println("Exception while calling PreviewApi:");
			e.printStackTrace();
		}
	}
}

using System;
using GroupDocs.Annotation.Cloud.Sdk.Api;
using GroupDocs.Annotation.Cloud.Sdk.Client;
using GroupDocs.Annotation.Cloud.Sdk.Model;
using GroupDocs.Annotation.Cloud.Sdk.Model.Requests;

namespace GroupDocs.Annotation.Cloud.Examples.CSharp
{
	// Get document pages as images from File
	class Get_Pages
	{
		public static void Run()
		{
			var configuration = new Configuration(Common.MyAppSid, Common.MyAppKey);
			var apiInstance = new PreviewApi(configuration);

			try
			{
				// Set request.
				var request = new GetPagesRequest()
				{
					filePath = "Annotationdocs\\ten-pages.docx",
					password = null,
					pageNumber = 1,
					countPagesToConvert = 1,
					enableCaching = false,
					cacheStoragePath = null,
					withoutAnnotations = true
				};

				var response = apiInstance.GetPages(request);
				Console.WriteLine("Expected response type is PageImages: " + response.ToString());
			}
			catch (Exception e)
			{
				Console.WriteLine("Exception while calling Annotation PreviewApi: " + e.Message);
			}
		}
	}
}