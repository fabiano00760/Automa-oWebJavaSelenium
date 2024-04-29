package F.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;


public class FDriver {


    public static WebDriver driver;


    @Before
    public static void init() throws InterruptedException {
        driver = WebDriverManager.firefoxdriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);

        try {
            // Executar JavaScript para substituir todos os frames pelos seus conteúdos
            JavascriptExecutor js = (JavascriptExecutor) getDrive();

            js.executeScript("var element = document.evaluate(\"//div[@id='aswift_6_host']\", document, null, " +
                    "XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;" +
                    "if (element) {" +
                    "    element.parentNode.removeChild(element);" +
                    "}");

            js.executeScript(
                    "var frames = document.getElementsByTagName('iframe');"
                            + "for (var i = 0; i < frames.length; i++) {"
                            + "    var frame = frames[i];"
                            + "    var frameContent = frame.contentDocument || frame.contentWindow.document;"
                            + "    var frameBody = frameContent.body;"
                            + "    var newDiv = document.createElement('div');"
                            + "    newDiv.innerHTML = frameBody.innerHTML;"
                            + "    frame.parentNode.replaceChild(newDiv, frame);"
                            + "}");

            // Encontrar e remover todos os elementos de vídeo na página
            js.executeScript(
                    "var videos = document.getElementsByTagName('video');"
                            + "for (var i = 0; i < videos.length; i++) {"
                            + "    var video = videos[i];"
                            + "    video.parentNode.removeChild(video);"
                            + "}");

            // Agora você pode interagir com os elementos na página como se os frames e vídeos não estivessem presentes

            // Fechar pop-up de propaganda, se presente
            js.executeScript(
                    "var popup = document.getElementById('id_do_popup');"
                            + "if (popup) {"
                            + "    popup.parentNode.removeChild(popup);"
                            + "}");

        } catch (Exception e) {
            System.out.println(e);
        }



    }

    public static WebDriver getDrive() {
        return driver;
    }

    @After
    public static void fecharDriver() {
        driver.close();
    }

    @AfterAll
    public static void endTest() {
        driver.quit();
    }
}


