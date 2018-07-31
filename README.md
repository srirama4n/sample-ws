# sample-ws
ws service
https://github.com/salmar/spring-websocket-chat/tree/master/src/main/java/org/springframework/boot/actuate


Syatem Set UP
@echo off
start "" /w /b "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" "https://w01cdcifjir1a.reg1.1bank.dbs.com:8443/secure/RapidBoard.jspa?rapidView=20362&selectedIssue=CSTICAPF-856"
start "" /w /b "C:\Program Files (x86)\Microsoft Office\root\Office16\OUTLOOK.EXE"
start "" /w /b "C:\Java\ideaIU-2016.3.4.win\bin\idea64.exe"
start "" /w /b "C:\Program Files (x86)\Notepad++\notepad++.exe"

start cmd.exe /k "TITLE mysql && D: && cd D:\mariadb\bin && mysqld"
start cmd.exe /k "TITLE nginx && D: && cd D:\nginx && start nginx"
start cmd.exe /k "TITLE cap-internal-rating-ui && D: && cd D:\Users\sriramanimmala\Documents\derby-fedora\cap-internal-rating-ui && npm start"
start cmd.exe /k "TITLE wiremock && D: && cd D:\wiremock && java -jar "D:\wiremock\wiremock-standalone-2.5.0.jar" --port=9999"

