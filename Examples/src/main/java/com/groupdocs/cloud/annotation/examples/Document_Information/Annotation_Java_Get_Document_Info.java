
//TODO: Get your AppSID and AppKey at https://dashboard.groupdocs.cloud (free registration is required).


			// create request instance
			GetImportRequest request = new GetImportRequest();
			request.setName("one-page-annotated.pdf");
			request.setFolder("annotationdocs");
			request.setPassword("");

			// Call api with request
			DocumentInfo response = apiInstance.getImport(request);

			// Get and write output
			System.out.println("DocumentInfo: " + response.getName());
			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling AnnotationApi");
			e.printStackTrace();
		}
	}
