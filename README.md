# Temperature-Converter
Small example of a Spring Boot application receiving POST requests to convert between Celsius, Kelvin and Fahrenheit temperature units.
All responses are in JSON.

## To convert from Celsius:
Send a POST request to http://<server>:<port>/celsius/ with the following body:
{
	"value": 20
}

## To convert from Kelvin:
Send a POST request to http://<server>:<port>/kelvin/ with the following body:
{
	"value": 20
}

## To convert from Fahrenheit:
Send a POST request to http://<server>:<port>/fahrenheit/ with the following body:
{
	"value": 20
}
