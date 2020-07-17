# MicroProfile generated Applications
![Java CI with Maven](https://github.com/arulkumar-lab/UserModule/workflows/Java%20CI%20with%20Maven/badge.svg)

MicroProfile Starter has generated 2 MicroProfile applications for you.

There are 2 projects generated so that the examples for the Rest Client and/or JWT Auth specification are more realistic in the sense that they actually call an endpoint within another service.

. In the `service-a` directory (user-service-api), you can find an application with the major parts of the application. This can be seen as the 'client'.
. In the `service-b` directory (user-service), you can find some endpoints which will be called by code within the client application. This can be seen as the 'backend'.

Note: New Service client endpoints CDI don't forgot to add mapping entries in META-INF\microprofile-config.properties

**Features:**

appSecurity-2.0

cdi-2.0

concurrent-1.0

distributedMap-1.0

jaxrs-2.1

jaxrsClient-2.1

jndi-1.0

json-1.0

jsonb-1.0

jsonp-1.1

jwt-1.0

microProfile-3.3

monitor-1.0

mpConfig-1.4

mpFaultTolerance-2.1

mpHealth-2.2

mpJwt-1.1

mpMetrics-2.3

mpOpenAPI-1.1

mpOpenTracing-1.3

mpRestClient-1.4

opentracing-1.3

servlet-4.0

ssl-1.0


Have a look in the `readme.md` file in each directory which describes how each project can be built and run.
