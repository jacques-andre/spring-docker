```
docker build -t spring-example-image .
docker run -d -p 8080:8080 --name spring-example-container spring-example-image
```
