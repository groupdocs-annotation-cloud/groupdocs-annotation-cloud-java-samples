
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).


			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			PostPagesRequest request = new PostPagesRequest();
			request.setName("two-page.docx");
			request.setFolder("annotationdocs");

			// Call api with request
			ImagePages response = apiInstance.postPages(request);

			// Get and write output
			System.out.println("Pages count: " + response.getEntries().size());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
