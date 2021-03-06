# credit-line

# Project Title

Microservice that determines the credit line that better suits to the customers in Tribal.

## Architecture
![](images/Diagram.png)

![](images/swaggerdefinition.PNG)

![](images/Eurekaserver.PNG)


## Getting Started


### Installing

*  Download the three projects found in the repository
*  Import them into the reference IDE (Example: STS)
*  Running tribal-credit-line-eureka
*  Run tribal-credit-line-gateway-server
*  Run tribal-credit-line (There is no specific port
established for this service, each time the service is executed it will be running on a different port,
if you want to change the port to a specific one, you must modify server.port = 0 in the application.properties file)
*  Consume the POST service using the URL http: // localhost: 8090 / api / gateway / tribal / validate

Example Request:

```json
{
  "businessType": "SME",
  "cashBalance": 435.30,
  "montlyRevenue": 4235.45,
  "requestedCreditLine": 100,
  "requestedDate": "2021-08-22T23:01:35.782Z"
}
```

### Executing program

Request using business type STARTUP

![](images/Request_STARTUP.PNG)

Request using business type SME

![](images/Request_SME.PNG)

Request using business type STARTUP and credit line was rejected

![](images/Request_Rejected.PNG)
