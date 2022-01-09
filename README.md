# Docker Compose Spring Boot,Jaeger,Prometheus And Grafana example

## Run the System
We can easily run the whole with only a single command:

* `docker-compose up`

The services can be run on the background with command:

* `docker-compose up -d`


## Stop the System
Stopping all the running containers is also simple with a single command:

* `docker-compose down`


If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:

* `docker-compose down --rmi all`

### EndPoints ###

| Service       | EndPoint                      | Method | Description                                      |
| ------------- | ----------------------------- | :-----:| ------------------------------------------------ |
| ShortenUrl    | /v1/shorten   				| POST   | Return shorten url             	                |

- **Jaeger**

![Jaeger](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/jaeger.PNG)

- **Prometheus**

![Prometheus](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/prometheus.PNG)
	
- **Grafana**

![Grafana](https://github.com/tugayesilyurt/spring-zipkin-cassandra/blob/main/assets/grafana.PNG)