package test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.regex.Pattern;

import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ServiceContractPage {

    public static void selected(String name){
        $(By.xpath("//td[@class='x-btn-center']/button[@class='x-btn-menu-arrow-el']")).click();
        $(By.xpath("//a[text()='"+name+"']")).click();

    }

    public static void selectingTabs(String tabs){
        $(By.xpath("//ul[@class='x-tab-strip x-tab-strip-top']//span[text()='"+tabs+"']")).click();
        sleep(500);
    }

    //нажимает на фильтр
    public static void filtre(){
        $(By.xpath("//img[contains(@class,'x-form-trigger x-form-arrow-trigger ')]")).click();
        $(By.xpath("//div[text()='Юридическое лицо']")).click();
    }

    public static void editContract(){
        $(By.xpath("//div[@class='x-form-field-wrap x-abs-layout-item ']/img[contains(@class,'x-form-trigger x-form-arrow-trigger ')]")).click();
    }

    public static void entityAndChecking() {
        sleep(2000);
        $(By.xpath("//input[@id='cust_type']")).click();
        $(By.xpath("//input[@id='cust_type']")).clear();
        $(By.xpath("//input[@id='cust_type']")).setValue("Юридическое лицо");
        $(By.xpath("//input[@id='cust_type']")).sendKeys(Keys.TAB);
        $(By.xpath("//input[@id='cust']")).sendKeys(Keys.TAB,Keys.SPACE);

    }

    public static void infoCompany(String value) {
        switch (value) {
            case "Общее сведения о компании Заказчика 1/4":
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='name']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='name']")).setValue("Пинки и Брейн");
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='jurform']")).clear();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='name']")).setValue("\"Пинки и Брейн\"");
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='engname']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='engname']")).setValue("Pinky and the Brain");
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='shortname']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='shortname']")).setValue("ПиБ");
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='jurform']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='jurform']")).clear();
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='jurform']")).setValue("Религиозная организация");
                $(By.xpath("//div[@class='x-fieldset-body']/input[@id='authcap']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@id='authcap']")).setValue("1");
                $(By.xpath("//div[@class='x-fieldset-body']/textarea[@id='compactivity']")).setValue("Основная цель - захватить весь мир!");
                break;
            case "Общее сведения о компании Заказчика 2/4":
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='inn']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='inn']")).setValue("9289112474"); //ИНН
                break;
            case "Общее сведения о компании Заказчика 3/4":
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='okpo']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='okpo']")).setValue("123456789"); //ОКПО
                break;
            case "Общее сведения о компании Заказчика 4/4":
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='okpo']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']//input[@id='okpo']")).setValue("0987654321"); //ОКПО
                break;
            case "Контактная информация Заказчика[Проверка №1]":
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='email']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='email']")).setValue("123");
                break;
            case "Контактная информация Заказчика[Проверка №2]":
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='email']")).click();
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='email']")).setValue("pokemon@pika.chu");
                $(By.xpath("//div[@class='x-fieldset-body']/input[@name='fax']")).click();

        }
        //        7705033216

    }

    }
