@echo off
set path=C:\Users\rida.madrane\.m2\repository\allure\allure-2.13.9\bin;C:\Users\rida.madrane\.jdks\openjdk-15.0.2\bin;%path%
allure serve allure-results
pause
exit