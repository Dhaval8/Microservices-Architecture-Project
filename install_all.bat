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
