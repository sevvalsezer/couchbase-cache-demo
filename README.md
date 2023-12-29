# Getting Started

### Prerequisites
- Java 17 SDK
- Docker

### Environment Setup
- Start a single node cluster Couchbase Server by using Docker with the following command.

    `docker run -d --name couchbase-local -p 8091-8096:8091-8096 -p 11210-11211:11210-11211 couchbase`

- Navigate to http://localhost:8091
- Select "Setup New Cluster".
- Create new cluster with the following configs:
  - Cluster Name: `product-cluster`
  - Create Admin Username: `administrator`
  - Create Password: `Pass123*`
- Leave the other settings as default.
- Navigate to http://localhost:8091/ui/index.html#/buckets and click "ADD BUCKET" at top right.
- Create a new bucket named as `product-bucket`.
- Run the Spring Boot application.

# Example Requests
- `curl --location 'http://localhost:8080/products'`
- `curl --location 'http://localhost:8080/products/1'`
- `curl --location 'http://localhost:8080/products/2'`
