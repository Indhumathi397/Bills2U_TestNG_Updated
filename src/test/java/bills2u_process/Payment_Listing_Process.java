package test.java.bills2u_process;

import test.java.Config.PropertyClass;
import test.java.bills2u_constant.*;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.google.common.io.Files;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.bills2u_root.Root_Class_TestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Payment_Listing_Process extends Root_Class_TestNG {
    public static void getTestData() throws IOException {
        PropertyClass rp=new PropertyClass();
        prop = rp.readPropertiesFile();
    }
    
    public static void clickOnInvoiceMenuProcess() throws IOException {
        getTestData();
        try {
            Obj_Rep_Home objHome = new Obj_Rep_Home();
            PageFactory.initElements(driver, objHome);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            Actions act = new Actions(driver);
            log.info("Waiting till the 'Invoice' menu is display");
            wait.until(ExpectedConditions.visibilityOf(objHome.invoiceMenu));
            log.info("Waiting till the 'Invoice' menu is click");
            wait.until(ExpectedConditions.elementToBeClickable(objHome.invoiceMenu));
            try {
                log.info("Clicking on the 'Invoice' menu");
                act.moveToElement(objHome.invoiceMenu).click().build().perform();
                log.info("'Invoice' menu has clicked");
                Thread.sleep(5000);
            } catch (Exception ex) {
                log.info("'Invoice' menu has not clicked.   But it displayed the exception as...\n" + ex.getMessage());
            }
        } catch (Exception ex) {
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"clickOnInvoiceMenuProcess.jpeg"));
            log.info(ex.getMessage());
            test.fail(ex.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory") + "/clickOnInvoiceMenuProcess.jpeg").build());
        }
    }
    public static void clickOnPaymentMenu() throws IOException {
        getTestData();
        try {
            Obj_Rep_Home objHome = new Obj_Rep_Home();
            PageFactory.initElements(driver, objHome);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            Actions act = new Actions(driver);
            log.info("Waiting till the 'Payments' menu is display");
            wait.until(ExpectedConditions.visibilityOf(objHome.paymentsMenu));
            log.info("Waiting till the 'Payments' menu is click");
            wait.until(ExpectedConditions.elementToBeClickable(objHome.paymentsMenu));
            try {
                log.info("Clicking on the 'Payments' menu");
                act.moveToElement(objHome.paymentsMenu).click().build().perform();
                log.info("'Payments' menu has clicked");
                Thread.sleep(7000);
                log.info("Waiting till the Page is loading");
                driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

                Obj_Rep_Invoice objInvoice = new Obj_Rep_Invoice();
                PageFactory.initElements(driver, objInvoice);
                log.info("Waiting till the 'Payment Listing' label is display");
                wait.until(ExpectedConditions.visibilityOf(objInvoice.paymentListingHeader));

                if (objInvoice.paymentListingHeader.isDisplayed()) {
                    test.pass("Biller has able to view Payment Listing page");
                    log.info("Biller has able to view Payment Listing page");
                } else {
                    test.fail("Biller has not able to view Payment Listing page");
                    log.info("Biller has not able to view Payment Listing page");
                }
            } catch (Exception ex) {
                log.info("'Payment Listing' menu has not clicked.   But it displayed the exception as...\n" + ex.getMessage());
                test.fail("'Payment Listing' menu has not clicked.   But it displayed the exception as...\n" + ex.getMessage());
            }
        } catch (Exception ex) {
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"clickOnPaymentMenu.jpeg"));
            log.info(ex.getMessage());
            test.fail(ex.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory") + "/clickOnPaymentMenu.jpeg").build());
        }
    }
    public static void placeTheCursorOnShowFilter() throws IOException {
        getTestData();
        try {
            Obj_Rep_Invoice objInvoice = new Obj_Rep_Invoice();
            PageFactory.initElements(driver, objInvoice);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            Actions act = new Actions(driver);
            log.info("Waiting till the 'Show Filter' label is display");
            wait.until(ExpectedConditions.visibilityOf(objInvoice.showAndHideFilterPayments));
            if (objInvoice.showAndHideFilterPayments.isDisplayed()) {
                if (objInvoice.showAndHideFilterPayments.isEnabled()) {
                    log.info("Waiting till the 'Show Filter' is click");
                    wait.until(ExpectedConditions.elementToBeClickable(objInvoice.showAndHideFilterPayments));
                    try {
                        log.info("Placing the cursor on 'Show Filter'");
                        act.moveToElement(objInvoice.showAndHideFilterPayments).build().perform();
                        Obj_Rep_Tooltip objTooltip = new Obj_Rep_Tooltip();
                        PageFactory.initElements(driver, objTooltip);
                        System.out.println(objTooltip.expand.getAttribute("aria-describedby"));
                        System.out.println(objTooltip.expandTooltip.getAttribute("id"));

                        if (objTooltip.expand.getAttribute("aria-describedby").equals(objTooltip.expandTooltip.getAttribute("id"))) {
                            JavascriptExecutor j = (JavascriptExecutor) driver;
                            j.executeScript("document.getElementById('cdk-describedby-message-14').value='Expand';");
                            String s = (String) j.executeScript("return document.getElementById('cdk-describedby-message-14').value");
                            System.out.println(s);
                            if (s.equals("Expand")) {
                                test.pass("Biller has able to view the Expand tooltip");
                                log.info("Biller has able to view the Expand tooltip");
                            } else {
                                test.fail("'Expand Tooltip' has deviated from it's expected data.  But it displayed as " + s);
                                log.info("'Expand Tooltip' has deviated from it's expected data.  But it displayed as " + s);
                            }
                        } else {
                            test.fail("Tooltip Locator has not matched");
                            log.info("Tooltip Locator has not matched");
                        }
                    } catch (Exception ex) {
                        test.fail("Show Filter has not clicked.  But it displayed the Exception as..\n" + ex.getMessage());
                        log.info("Show Filter has not clicked.  But it displayed the Exception as..\n" + ex.getMessage());
                    }
                } else {
                    test.fail("'Show Filter' has not enabled to click");
                    log.info("'Show Filter' has not enabled to click");
                }
            } else {
                test.fail("'Show Filter' has not displayed");
                log.info("'Show Filter' has not displayed");
            }
        } catch (Exception ex) {
            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(screen, new File(prop.getProperty("Bills2U.screenshot.Directory")+"placeTheCursorOnShowFilter.jpeg"));
            log.info(ex.getMessage());
            test.fail(ex.getMessage());
            test.info("Here, the screenshot has been attached.\n", MediaEntityBuilder.createScreenCaptureFromPath(prop.getProperty("Bills2U.screenshot.Directory") + "/placeTheCursorOnShowFilter.jpeg").build());
        }
    }

}
