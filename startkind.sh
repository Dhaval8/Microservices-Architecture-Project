#!/bin/bash
kind delete cluster --name ma-cluster
kind create cluster --name ma-cluster --config kind-config.yaml
docker-compose build
kind load docker-image microservices-architecture-project-eureka-server --name ma-cluster
kind load docker-image microservices-architecture-project-api-gateway --name ma-cluster
kind load docker-image microservices-architecture-project-config-server --name ma-cluster
kind load docker-image microservices-architecture-project-vehicle-service --name ma-cluster
kind load docker-image microservices-architecture-project-vehicle-km-service --name ma-cluster
kind load docker-image microservices-architecture-project-user-service --name ma-cluster
kind load docker-image microservices-architecture-project-booking-service --name ma-cluster
kind load docker-image microservices-architecture-project-payment-service --name ma-cluster
kind load docker-image microservices-architecture-project-owner-service --name ma-cluster

kubectl apply -f mysql-files/
kubectl apply -f MAEureka/
kubectl apply -f MAAPIGateway/
kubectl apply -f config-server/
kubectl apply -f Vehicle/
kubectl apply -f VehicleKilometerTracking/
kubectl apply -f MAProjectUserServices/
kubectl apply -f MAProjectBookingServices/
kubectl apply -f MAProjectPaymentServices/
kubectl apply -f MAProjectOwnerServices/

kubectl get pods

