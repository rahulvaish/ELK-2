package com.elastic.search.RESTClientForElasticSearch;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class RESTClientForElasticSearch {
	
	public static void getElasticData() {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:9200/entertainment/movies/001");
						
			ClientResponse response = webResource.accept("application/json")
	                   .get(ClientResponse.class);

			if (response.getStatus() != 200) {
			   throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }
	}
	
	
	public static void postElasticData() {
		try {

			Client client = Client.create();
			//CHANGE THE ID BEFORE HIT
			WebResource webResource = client
			   .resource("http://localhost:9200/crud/posts/005");

			String input = "{\"singer\":\"HUTCH\",\"title\":\"ORANGE\"}";
			

			ClientResponse response = webResource.type("application/json")
			   .post(ClientResponse.class, input);

			if (response.getStatus() != 201) {
				throw new RuntimeException("Failed : HTTP error code : "
				     + response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			String output = response.getEntity(String.class);
			System.out.println(output);

		  } catch (Exception e) {

			e.printStackTrace();

		  }

	}
	
	public static void main(String args []) {
		//CHANGE THE ID IN postElasticData() BEFORE HIT
		//RESTClientForElasticSearch.postElasticData();
		RESTClientForElasticSearch.getElasticData();
		
	}
}