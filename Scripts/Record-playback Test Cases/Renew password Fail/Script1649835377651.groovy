import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/log-in')

WebUI.click(findTestObject('Object Repository/Renew password/Page_React App/p_Renew Password'))

WebUI.setText(findTestObject('Object Repository/Renew password/Page_React App/input_Sign Up_email'), 'abc@abc.com')

WebUI.click(findTestObject('Object Repository/Renew password/Page_React App/button_Renew Password'))

try {
    WebUI.delay(5)

    WebUI.verifyAlertPresent(5)
}
catch (Exception ex) {
    WebUI.switchToDefaultContent()

    WebUI.click(findTestObject('Object Repository/Renew password/Page_React App/button_Renew Password'))
} 

WebUI.waitForAlert(5)

WebUI.verifyAlertPresent(5)

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'User not exist.')

WebUI.closeBrowser()

