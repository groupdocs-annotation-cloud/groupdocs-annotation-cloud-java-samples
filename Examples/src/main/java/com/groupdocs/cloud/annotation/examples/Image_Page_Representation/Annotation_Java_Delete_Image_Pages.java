
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).


			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			DeletePagesRequest request = new DeletePagesRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");

			// Call api with request
			File response = apiInstance.deletePages(request);

			// Get and write output
			System.out.println("Previously generated images for document pages deleted: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
