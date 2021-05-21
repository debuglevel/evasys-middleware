<!--- some badges to display on the GitHub page -->

![Travis (.org)](https://img.shields.io/travis/debuglevel/greeting-microservice?label=Travis%20build)
![Gitlab pipeline status](https://img.shields.io/gitlab/pipeline/debuglevel/greeting-microservice?label=GitLab%20build)
![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/debuglevel/greeting-microservice?sort=semver)
![GitHub](https://img.shields.io/github/license/debuglevel/greeting-microservice)
[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/debuglevel/greeting-microservice)

# EvaSys Middleware

EvaSys provides a SOAP interface (remote procedure calls) by default, but no REST interface (which is often considered a
more modern approach to GET, POST and DELETE resources). This middleware provides translates the EvaSys SOAP interface
to a REST interface.

## Development

### Axis 1.4 WSDL to Java Generation

`java -cp "axis-ant.jar;axis.jar;commons-discovery-0.2.jar;commons-logging-1.0.4.jar;jaxrpc.jar;log4j-1.2.8.jar;saaj.jar;wsdl4j-1.5.1.jar" org.apache.axis.wsdl.WSDL2Java -v -T 1.2 -o DESTIONATION_DIR -p de.debuglevel.evasysmiddleware.soap ../../../soapserver.wsdl`

### WSDL to Java Generation

`./gradlew wsdl2java`

### Generate SOAP Java classes

## HTTP API

### OpenAPI / Swagger

There is an OpenAPI (former: Swagger) specification created, which is available
at <http://localhost:8080/swagger/greeter-microservice-0.1.yml>, `build/tmp/kapt3/classes/main/META-INF/swagger/` in the
source directory and `META-INF/swagger/` in the jar file. It can easily be pasted into
the [Swagger Editor](https://editor.swagger.io) which provides a live demo
for [Swagger UI](https://swagger.io/tools/swagger-ui/), but also offers to create client libraries
via [OpenAPI Generator](https://openapi-generator.tech).

### Add person

```bash
$ curl --location --request POST 'http://localhost:8080/persons/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Foo Bar"
}'

{
    "id": "3e266d3b-df74-4918-9d5d-22a5983e9dc2",
    "name": "Foo Bar"
}
```

### Get person

```bash
$ curl --location --request GET 'http://localhost:8080/persons/3e266d3b-df74-4918-9d5d-22a5983e9dc2'

{
    "id": "3e266d3b-df74-4918-9d5d-22a5983e9dc2",
    "name": "Foo Bar"
}
```

## Configuration

There is a `application.yml` included in the jar file. Its content can be modified and saved as a
separate `application.yml` on the level of the jar file. Configuration can also be applied via the other supported ways
of Micronaut (see <https://docs.micronaut.io/latest/guide/index.html#config>). For Docker, the configuration via
environment variables is the most interesting one (see `docker-compose.yml`).
