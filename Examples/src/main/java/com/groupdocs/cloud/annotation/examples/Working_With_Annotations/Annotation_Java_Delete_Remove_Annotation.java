
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).


			// Create and get annotation api instance
			AnnotationApi apiInstance = Utils.getAnnotationApiInstance();

			// create request instance
			DeleteCleanDocumentRequest request = new DeleteCleanDocumentRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			File response = apiInstance.deleteCleanDocument(request);

			// Get and write output
			System.out.println("Annotations removed from document: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
