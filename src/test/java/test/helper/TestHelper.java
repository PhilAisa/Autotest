package test.helper;


import org.openqa.selenium.By;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Spiri on 24.08.2017.
 */
public class TestHelper {

//    public static String text = null;
    public static String login = "DFEW684";
    public static String password = "Work4Joy684";


    //Вход в систему
    public static void login() {
        $(By.xpath("//input[@type='text']")).click();
        $(By.xpath("//input[@type='text']")).setValue(login);
        $(By.xpath("//input[@type='password']")).click();
        $(By.xpath("//input[@type='password']")).setValue(password);
        $(By.xpath("//td[@class='x-btn-center']")).click();
    }

    //Кликает по иконкам модули
    public static void openClickModule(String namemodule) {
        $(By.xpath("//p[text()='" + namemodule + "']")).click();
    }

    public static void selectRow() {
        sleep(500);
        $(By.xpath("//div[contains(@class,'x-grid3-row  x-grid3-row-first ')]/table/tbody")).click();
    }

    public static void testTypeField(String value, String field, String fieldName) {
        switch (value) {
            case "Цифры":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("12345");
                break;
            case "Английские":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("QwertY");
                break;
            case "Русские":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("ЙцукеН");
                break;
            case "Анг и рус":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("ЙцуQwe");
                break;
            case "Спец":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("'\"!№#;%:?*(\"");
                break;
            case "Все":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("'\"!№#;%:?*(\"12345QwertY|ЙцукеН");
                break;
            default:
            case "":
                $(By.xpath("//label[text()='"+field+"' ]/../input[@name='"+fieldName+"']")).setValue("");
        }
    }


    public static void clickSave(){
        sleep(1500);
        $(By.xpath("//button[text()='Сохранить проект']")).click();
        }

    //Нажимает на кнопку из названия формы\окны
    public static void buttonClick(String nameWindows,String button){
        sleep(1500);
        if($(By.xpath("//span[text()='"+nameWindows+"']/../../../../../div[@class='x-window-bwrap']//button[text()='"+button+"']")).exists()){
        $(By.xpath("//span[text()='"+nameWindows+"']/../../../../../div[@class='x-window-bwrap']//button[text()='"+button+"']")).click();
    } else {
            $(By.xpath("//button[text()='"+button+"']")).click();
        }
    }

    public static void closeWindows() {
        $(By.xpath("//div[contains(@class, 'x-tool x-tool-close')]")).click();
    }

    public static void testWindows() {
        sleep(1500);
        if ($(By.xpath("//span[@class='x-window-header-text' and text()='Ошибка']")).exists()) {
            $(By.xpath("//span[@class='x-window-header-text' and text()='Ошибка']")).should(visible);
            $(By.xpath("//button[@class='x-btn-text' and text()='OK']")).click();
        } else if ($(By.xpath("//span[@class='x-window-header-text' and text()='Ошибка ']")).exists()) {
            $(By.xpath("//span[@class='x-window-header-text' and text()='Ошибка ']")).should(visible);
            $(By.xpath("//button[@class='x-btn-text' and text()='OK']")).click();
        } else if ($(By.xpath("//div[contains(@class,'x-progress-bar')]//div[text()='Сохранение...']")).exists()) {
            $(By.xpath("//div[contains(@class,'x-progress-bar')]//div[text()='Сохранение...']")).should(visible);
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        } else if ($(By.xpath("//span[text()='Сервисные контракты']")).exists()) {
            $(By.xpath("//span[text()='Сервисные контракты']")).click();
        }
    }


//    public static void menuClicking() {
//        List<SelenideElement> list = new ArrayList<SelenideElement>();
//        ElementsCollection mass = $$(By.xpath("//ul[not(contains(@class,'tabs-menu_theme_black'))]//li[@data-name]"));
//        if (mass.size() > 0) {
//            for (int j = 0; j < mass.size(); j++) {
//                list.add(mass.get(j));
//            }
//            for (int i = 1; i < mass.size(); i++) {
//                list.get(i).click();
//                sleep(800);
//                TestHelper.tabClicking();
//            }
//        }
//        if ($(By.xpath("//div[@class='rubber rubber_nav']//div[@aria-label='ещё ']")).isDisplayed()) {
//            $(By.xpath("//div[@class='rubber rubber_nav']//div[@aria-label='ещё ']")).click();
//            $(By.xpath("//div[@class='popup__content']//a[@href='https://news.yandex.ru/auto.html?from=rubric']")).click();
//        }
//        $(By.xpath("//div[contains(@class,'paranja paranja_autoclosable_no paranja_state_close')]")).waitWhile(visible, 3000);
//    }
//
//    public static void tabClicking() {
//        List<SelenideElement> list = new ArrayList<com.codeborne.selenide.SelenideElement>();
//        ElementsCollection mass = $$(By.xpath("//ul[contains(@class,'tabs-menu_theme_black')]//li[@data-name]"));
//        if (mass.size() > 0) {
//            for (int j = 0; j < mass.size(); j++) {
//                list.add(mass.get(j));
//            }
//            for (int i = 0; i < mass.size(); i++) {
//                sleep(500);
//                list.get(i).click();
//                sleep(800);
//            }
//        }
//    }
//
//    public static void searchNew() {
////        text = $(By.xpath("//div[contains(@class,'stories-set__main-item')]//h2")).getText();
////        $(By.xpath("//input[@placeholder='Поиск']")).click();
////        $(By.xpath("//input[@placeholder='Поиск']")).setValue(text);
//        sleep(1000);
//        $(By.xpath("//button[text()='Найти']")).click();
//        sleep(2000);
//    }

}


