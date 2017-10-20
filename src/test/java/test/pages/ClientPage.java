package test.pages;

import org.openqa.selenium.By;
import test.helper.TestHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static java.lang.Thread.sleep;

public class ClientPage {

    public static String lname = "Иванов";
    public static String  name = "Иван";
    public static String mname = "Иванович";

    public static void openClient(){
        $(By.xpath("//img[@src='images/s.gif']/../../../div[@id='clients-win-shortcut']")).click();
    }
    //Создаем клиента, заполняем обязательные поля
    public static void Client() {
        $(By.xpath("//button[@class='x-btn-text addclient']/../button[text()='Создать']")).click();
        $(By.xpath("//div[@class='x-form-element']/input[@name='LNAME']")).click();
        $(By.xpath("//div[@class='x-form-element']/input[@name='LNAME']")).setValue(lname);
        $(By.xpath("//div[@class='x-form-element']/input[@name='NAME']")).click();
        $(By.xpath("//div[@class='x-form-element']/input[@name='NAME']")).setValue(name);
        $(By.xpath("//div[@class='x-form-element']/input[@name='MNAME']")).click();
        $(By.xpath("//div[@class='x-form-element']/input[@name='MNAME']")).setValue(mname);
        $(By.xpath("//input[@id='_SEX']")).click();
        $(By.xpath("//div[@class='x-combo-list-inner']/div[text()='Мужской']")).click();
        $(By.xpath("//input[@id='_COUNTRY']")).click();
        $(By.xpath("//div[@class='x-combo-list-inner']/div[text()='РФ']")).click();
        $(By.xpath("//div[@class='x-form-element']//input[@name='BDATE']")).setValue("01.01.1980");
        $(By.xpath("//div[@class='x-form-element']/input[@name='MOBILPHONE']")).setValue("89876543210");
        $(By.xpath("//div[@class='x-form-element']/input[@name='PASSPORTSERIA']")).setValue("1234");
        $(By.xpath("//div[@class='x-form-element']/input[@name='PASSPORTNUMBER']")).setValue("123456");
        $(By.xpath("//div[@class='x-form-element']/input[@name='WHO']")).setValue("ТП№777");
//        $(By.xpath("//div[@class='x-form-element']/input[@name='WHEN']")).click();
//        $(By.xpath("//input[@name='WHEN']")).setValue("09.09.1970");

    }
}