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

WebUI.setText(findTestObject('Object Repository/Student Map ID Success/Page_React App/input_Username_usn'), 'vinhtk')

WebUI.setEncryptedText(findTestObject('Object Repository/Student Map ID Success/Page_React App/input_Password_pwd'), 'PqsVwYhx40I=')

WebUI.click(findTestObject('Object Repository/Student Map ID Success/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Student Map ID Success/Page_React App/button_Vinh Tu Kien'))

WebUI.click(findTestObject('Object Repository/Student Map ID Success/Page_React App/a_Map ID'))

WebUI.setText(findTestObject('Object Repository/Student Map ID Success/Page_React App/input_Student ID_uid'), '12345')

WebUI.click(findTestObject('Object Repository/Student Map ID Success/Page_React App/button_Confirm'))

WebUI.verifyElementNotPresent(findTestObject('Student Map ID Success/Page_React App/input_Student ID_uid'), 10)

WebUI.closeBrowser()

