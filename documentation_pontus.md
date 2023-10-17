<h1>Hur man interagerar med API:et</h1>

Endpoint 
> http://localhost:8082/api/b2f/fetchProcessedData
* Då får man ut behandlad data


Endpoint
>http://localhost:8082/api/b2f/fetchRawData
* Då får man ut obehandlad data

_________________________________________________________________________________________________________________________________________


* DbmsFetchData,DBMSFetchRawData,B2fFetchProcessedData,B2fFetchProcessedData

Använder sig av Dbms's endpoints för att sedan hämta data från dbms och returnera ett json response/svar
ProcessedData controllern har vi för att exponera front-end till dessa enpoints och deras data

_________________________________________________________________________________________________________________________________________

>Controller

* I kontroller mappen finns det fyra **@Restcontrollers**
* B2fFetchProcessedData
  * Denna controller exponererar en API-endpunkt för front-end
        Den här koden gör en HTTP GET-begäran till en  URL,
        hämtar svaret och returnerar innehållet som en string.
        Användningen av @RestController säkerställer
        att returvärden från den här metoden automatiskt konverteras
        till ett JSON-svar
_________________________________________________________________________________________________________________________________________
 
* B2fFetchProcessedData
  * Denna controller exponererar en API-endpunkt för front-end
_________________________________________________________________________________________________________________________________________

* DBMSFetchData
  * Den controller har en API-endpunkt men är inte tänkt att exponeras för FrontEnd, den hämtar data ifrån JavaBackEndDMBS endpunkterna

        definierar den här koden en ändpunkt som gör en HTTP GET- Request
        till en API, hämtar data, paketerar det i ett ApiResponseDTO och returnerar det som ett JSON-svar.
        Detta  i RESTful-API:er
_________________________________________________________________________________________________________________________________________
* DBMSFetchRawData
  * Den controller har en API-endpunkt men är inte tänkt att exponeras för FrontEnd, den hämtar rådata ifrån JavaBackEndDMBS endpunkterna

Den här koden är liknande det tidigare exemplet, men den hämtar rå temperaturdata från en annan API-ändpunkt, paketerar den i en ApiResponseDTO och returnerar den som ett JSON-svar.

_________________________________________________________________________________________________________________________________________


>dto
* Detta innehåller DTO klasser som transformerar om JSON datat och behandlar det, på så vis får man välformaterat data när man interagerar med API-endpunkterna



* DTO datatransfer object - 
ApiResponseDTO
Blueprint för att skapa objekt som lagrar API-svar 
man kan skapa instanser av klassen för att kapsla in API-svar och sedan komma åt eller
ändra data och meddelande med hjälp av getters och setters metoderna

_________________________________________________________________________________________________________________________________________

ProcessedDataDto - 
DTOs används ofta för att kapsla in data och skicka den mellan olika delar av en applikation eller mellan olika komponenter, till exempel när man skickar data över nätverket som svar i en RESTful API

  Genom att använda @Data-annotationen genererar Lombok automatiskt getters 
  och setters metoder för varje av dessa fält.
  ProcessedDataDTO är en Java-klass avsedd att hålla flera listor med data,
  var och en relaterad till en specifik aspekt av bearbetad data i din applikation
_________________________________________________________________________________________________________________________________________

ProcessedDataWrapperDTO- 
Wrapperklassen beror på de specifika kraven i din applikation och hur du vill strukturera din data.
Vi använder för att istället för att ändra i processed data så kan vi nu göra det här. Det ger alltså underhållning lättare.
underhållsfördelar, särskilt i komplexa programvarusystem eller när du designar API:er som behöver utvecklas över tid

