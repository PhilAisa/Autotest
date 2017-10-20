package test.steps;

import test.helper.TestHelper;
import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.When;
import test.pages.ServiceContractPage;

import static com.codeborne.selenide.Selenide.*;
import static test.helper.TestHelper.*;
import static test.pages.ServiceContractPage.entityAndChecking;
import static test.pages.ServiceContractPage.infoCompany;
import static test.pages.ServiceContractPage.selected;

/**
 * Created by Spiri on 24.08.2017.
 */
public class TestServiceContractPage {
    @When("^Вход в систему$")
    public static void Login()
    {
        TestHelper.login();
    }


    @When("^Проверка полей$")
    public static void testField() {
        TestHelper.openClickModule("Сервисные контракты");
        TestHelper.selectRow();
        buttonClick("Сервисные контракты","Редактировать");
        testTypeField("Анг и рус","НДС","nds");
        testTypeField("Все","НДС","nds");
        ServiceContractPage.selectingTabs("Автомобиль");
        testTypeField("Все","Гос. номер","num");
        sleep(1000);
        ServiceContractPage.selectingTabs("Заказчик");
        testTypeField("Все","Наименование","name");
        testTypeField("Все","Наименование (англ.)","engname");
        testTypeField("Все","Краткое наименование","shortname");
        sleep(1000);
        ServiceContractPage.selectingTabs("Подрядчик");
        testTypeField("Русские","Подписант","con_subscriber");
        testTypeField("Все","Основание","con_base");
        testTypeField("Все","В лице","con_inperson");
        testTypeField("Все","На основании","con_basednum");
        testTypeField("Все","№ документа основания","con_subscriber");
        }


    @When("^Создание сервисного контракта$")
    public static void openNews() throws InterruptedException{
        openClickModule("Сервисные контракты");
        selectRow();
        selected("Создать Сервисный Контракт");
        entityAndChecking();
        clickSave();
        testWindows();
        infoCompany("Общее сведения о компании Заказчика 1/4");
        clickSave();
        testWindows();
        infoCompany("Общее сведения о компании Заказчика 2/4");
        infoCompany("Общее сведения о компании Заказчика 3/4");
        clickSave();
        testWindows();
        infoCompany("Общее сведения о компании Заказчика 4/4");
        clickSave();
        testWindows();
        infoCompany("Контактная информация Заказчика[Проверка №1]");
        clickSave();
        testWindows();
        infoCompany("Контактная информация Заказчика[Проверка №2]");
        clickSave();








    }

}
