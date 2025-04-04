@echo off
cd config-server
.\mvnw clean install
cd ..

cd MAAPIGateway
.\mvnw clean install
cd ..

cd MAEureka
.\mvnw clean install
cd ..

cd Vehicle
.\mvnw clean install
cd ..

cd VehicleKilometerTracking
.\mvnw clean install
cd ..

cls
cd MAProjectUserServices
.\mvnw clean install -e
cd ..

cd MAProjectBookingServices
.\mvnw clean install
cd ..

cd MAProjectPaymentServices
.\mvnw clean install
cd ..

cd MAProjectOwnerServices
.\mvnw clean install
cd ..

echo Build process completed!
pause
