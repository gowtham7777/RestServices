# RestServices
goto url: 
https://start.spring.io
* select gradle, spring boot version. 
* Add dependencies devtools, web , jpa as per needed. 
* Generate Project. Unzip it. 
* Open STS, import as gradle project.
* Right click on java class (DemoRestServicesApplication, with spring boot application annotation) run as java application. 
* Devtool will open tomcat server running on 8080

*First Service Hello World is added. 
 Issue: Got whitelabel error at 8080/hello
 Resolution: main class should be in root package above other classes(com.demo.rest.wservices)

