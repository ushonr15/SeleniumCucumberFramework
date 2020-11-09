java -jar %cd%\Library\cucumber-sandwich-4.8.1-jar-with-dependencies.jar -n -f Report/ -o Report/

xcopy /s D:\Selenium_All\SeleniumCucumber\Report\cucumber-html-reports D:\Selenium_All\SeleniumCucumber\SharedReports
timeout 2
set url="http://localhost/overview-features.html"
start chrome %url%
rem start microsoft-edge:%url%
taskkill /F /IM chromedriver.exe
exit