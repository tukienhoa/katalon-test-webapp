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

WebUI.setText(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/input_Username_usn'), username)

WebUI.setText(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/input_Password_pwd'), password)

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/button_Nguyen Van A'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/a_Manage Profile'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/button_Edit'))

WebUI.setText(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/input_Email_email'), email)

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/button_Disable'))

WebUI.click(findTestObject('Object Repository/UpdateProfile/UpdateProfileFail/Page_React App/button_Update'))

WebUI.waitForAlert(10)

WebDriver driver = DriverFactory.getWebDriver()

String AlertText = driver.switchTo().alert().getText()

WebUI.verifyEqual(AlertText, 'Email is already exist.')

WebUI.closeBrowser()
