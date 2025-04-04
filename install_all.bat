@REM cd config-server
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd MAAPIGateway
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd MAEureka
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd Vehicle
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd VehicleKilometerTracking
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cls
@REM cd MAProjectUserServices
@REM .\mvnw clean install -e
@REM cd ..
@REM
@REM cd MAProjectBookingServices
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd MAProjectPaymentServices
@REM .\mvnw clean install
@REM cd ..
@REM
@REM cd MAProjectOwnerServices
@REM .\mvnw clean install
@REM cd ..
@REM
@REM echo Build process completed!
@REM pause


@echo off
setlocal enabledelayedexpansion

:: Array of service folders
set SERVICES=config-server MAAPIGateway MAEureka Vehicle VehicleKilometerTracking MAProjectUserServices MAProjectBookingServices MAProjectPaymentServices MAProjectOwnerServices

for %%S in (%SERVICES%) do (
    echo ================================
    echo Building %%S...
    echo ================================
    if exist %%S (
        cd %%S
        call .\mvnw clean install -e
        cd ..
    ) else (
        echo ERROR: Directory %%S does not exist!
    )
)

echo.
echo =====================================
echo Build process completed for all modules!
echo =====================================
pause
