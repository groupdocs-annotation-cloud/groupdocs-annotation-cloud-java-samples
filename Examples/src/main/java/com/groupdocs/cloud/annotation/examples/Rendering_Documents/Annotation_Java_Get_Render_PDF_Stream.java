
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).

			// Create and get annotation api instance
			PdfFileApi apiInstance = Utils.getPdfFileApiInstance();

			// create request instance
			GetPdfStreamRequest request = new GetPdfStreamRequest();
			request.setName("one-page.docx");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			File response = apiInstance.getPdfStream(request);

			// Get and write output
			System.out.println("File Name: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
