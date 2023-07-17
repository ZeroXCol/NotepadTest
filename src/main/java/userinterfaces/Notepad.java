package userinterfaces;

import org.openqa.selenium.By;

public class Notepad {


    public static By BTN_TEXTO_ENRIQUECIDO = By.xpath("//div//button[@id='richtextnote-tab']");
    public static By BTN_NEGRITA = By.xpath("//div[@class='ck ck-toolbar__items']//button[@class='ck ck-button ck-off'][1]");
    public static By TEXT_AREA = By.xpath("//div[@name='richNote']");

}
