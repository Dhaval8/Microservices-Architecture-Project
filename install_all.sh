#!/bin/bash

cd config-server
mvn clean install
cd -

cd MAAPIGateway                                                                                                                                           
mvn clean install
cd -

cd MAEureka                                                                                                                                               
mvn clean install
cd -

cd Vehicle                                                                                                                                                
mvn clean install
cd -

cd VehicleKilometerTracking
mvn clean install
cd -

clear
cd MAProjectUserServices                                                                                                                                  
mvn clean install -e
cd -

cd MAProjectBookingServices                                                                                                                               
mvn clean install
cd -

cd MAProjectPaymentServices                                                                                                                               
mvn clean install
cd -

cd MAProjectOwnerServices                                                                                                                                 
mvn clean install
cd -

