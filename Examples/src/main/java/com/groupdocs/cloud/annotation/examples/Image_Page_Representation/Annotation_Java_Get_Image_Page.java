
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).


			// Create and get annotation api instance
			ImagePagesApi apiInstance = Utils.getImagePagesApiInstance();

			// create request instance
			GetPageRequest request = new GetPageRequest();
			request.setName("two-page.docx");
			request.setFolder("annotationdocs");
			request.setPageNumber(0);

			// Call api with request
			ImagePage response = apiInstance.getPage(request);

			// Get and write output
			System.out.println("Page number: " + response.getNumber());
			System.out.println("Page link: " + response.getLink().getHref());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
