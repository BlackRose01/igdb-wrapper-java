# IGDB Wrapper for Java
This wrapper should help you to send easily requests to the IGDB API.

## Structure
Main package:
* Wrapper class: send requests to API endpoints
* Parameter class: manage possible parameters which will be accepted by API
* Postfixes enum: hold relational operators for filter method in Parameters class
* Version enum: hold versions of api  

Endpoint package:
* Endpoint interface to generalize different endpoint enumerations
* EndpointPublic enum for public endpoints
* EndpointPrivate enum for private  

Model package:
* all available models for endpoint

## Example
Create an instance of the IgdbWrapper with API-Key, API-Url and create a Parameter object with your filter information.
Finally, send the request to the API and save the response on the suitable model class.  

```java
// create instance of Wrapper
IgdbWrapper wrapper = new IgdbWrapper("<YOUR-API-KEY>", "<YOUR-API-URL>", Version.Standard);

// show all fields from games
// show full platform object list in games
// show full platform logo object in platform object
Parameters p = new Parameters()
        .addFields("*,platforms.*,platforms.platform_logo.*");

// send request to api and receive object
Game[] g = wrapper.sendRequest(EndpointPublic.Game, p, HttpMethod.POST, Game[].class);

// beautify JSON response
JsonParser parser = new JsonParser();
JsonObject json = parser.parse(g[0].toString()).getAsJsonObject();
Gson gson = new GsonBuilder().setPrettyPrinting().create();
String prettyJson = gson.toJson(json);
System.out.println(prettyJson);
```

## License
The scripts and documentation in this project are released under the [MIT License](https://github.com/actions/create-release/blob/main/LICENSE)

## Sources
* [IGDB API Documentation](https://api-docs.igdb.com/)