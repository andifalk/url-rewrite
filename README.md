# URL Rewrite

Demo project implementing url rewriting for static html pages 
(without any templating language, e.g. thymeleaf) using spring mvc and 
spring boot auto configuration functionality.

## Configuration

The whole configuration is done in `application.yml` file.
Here the path and suffix for html pages to be resolved are configured using
predefined spring properties:

* `spring.mvc.view.suffix = .html`
* `spring.mvc.view.prefix = /`

The mapping between url and the target static html page is configured using 
customized `rewrite` property.

```
rewrite:
    entries:
        - sourceUrl: /first
          target: firstpage
        - sourceUrl: /second
          target: secondpage
```

With these mappings the following rewrite url mappings are created:

* http:/localhost:8080/first  -> http://localhost:8080/firstpage.html  
* http:/localhost:8080/second -> http://localhost:8080/secondpage.html

This also works with query parameters as well.

## Run the demo

To run the demo just run the class `UrlRewriteApplication`.
After successfully starting the application you can access the two pages by locating your
browser to the following url's:

* [localhost:8080/first](http://localhost:8080/first)
* [localhost:8080/first?hello=world](http://localhost:8080/first?hello=world)
* [localhost:8080/second](http://localhost:8080/second)
* [localhost:8080/second?hello=world&msg=test](http://localhost:8080/second?hello=world&msg=test)

