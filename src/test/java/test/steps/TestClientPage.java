package test.steps;

import cucumber.api.java.en.When;
import test.helper.TestHelper;
import test.pages.ClientPage;

import static com.codeborne.selenide.Selenide.sleep;

public class TestClientPage {
    @When("^Клиент$")
    public static void Client(){
//        TestHelper.openClickModule("Клиенты                 ");
        sleep(25000);
        ClientPage.openClient(); //костыль из-за названия модуля (длинные чертовые пробелы)
        ClientPage.Client();
        TestHelper.buttonClick("Создание контрагента","Сохранить");
        TestHelper.closeWindows();
    }



}
