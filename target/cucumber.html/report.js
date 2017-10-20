$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test#1.feature");
formatter.feature({
  "line": 2,
  "name": "Test#1",
  "description": "",
  "id": "test#1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test#1"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Вход",
  "description": "",
  "id": "test#1;вход",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Вход в систему",
  "keyword": "When "
});
formatter.match({
  "location": "TestServiceContractPage.Login()"
});
formatter.result({
  "duration": 7846284212,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "EditClient",
  "description": "",
  "id": "test#1;editclient",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Клиент",
  "keyword": "When "
});
formatter.match({
  "location": "TestClientPage.Client()"
});
formatter.result({
  "duration": 39564631361,
  "status": "passed"
});
formatter.uri("Test#2.feature");
formatter.feature({
  "line": 2,
  "name": "Test#2",
  "description": "",
  "id": "test#2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test#2"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Вход",
  "description": "",
  "id": "test#2;вход",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Вход в систему",
  "keyword": "When "
});
formatter.match({
  "location": "TestServiceContractPage.Login()"
});
formatter.result({
  "duration": 1383945574,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Модуль Сервисные контракты",
  "description": "",
  "id": "test#2;модуль-сервисные-контракты",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#    When Проверка полей"
    }
  ],
  "line": 8,
  "name": "Создание сервисного контракта",
  "keyword": "When "
});
formatter.match({
  "location": "TestServiceContractPage.openNews()"
});
