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

cd MAProjectUserServices                                                                                                                                  
mvn clean install
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

