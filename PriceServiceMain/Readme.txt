Example:
Fetch all data
GET http://localhost:8080/PriceRestService/productPrice/

GET http://localhost:8080/PriceRestService/productPrice/{modelid}
Fetching Model# abc

POST http://localhost:8080/PriceRestService/productPrice/?modelId=dfaf&price=34599
Creating Model# model900 

DELETE http://localhost:8080/PriceRestService/productPrice/{modelid}
Fetching & Deleting Model# model900

DELETE http://localhost:8080/PriceRestService/productPrice/
Deleting All Model#