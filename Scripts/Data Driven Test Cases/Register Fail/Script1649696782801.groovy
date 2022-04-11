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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://localhost:3000/log-in')

WebUI.click(findTestObject('Object Repository/Register/Page_React App/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/Register/Page_React App/input_Create An Account_fullname'), fullname)

WebUI.setText(findTestObject('Object Repository/Register/Page_React App/input_Create An Account_username'), username)

WebUI.setText(findTestObject('Object Repository/Register/Page_React App/input_Create An Account_password'), password)

WebUI.setText(findTestObject('Object Repository/Register/Page_React App/input_Create An Account_email'), email)

WebUI.click(findTestObject('Object Repository/Register/Page_React App/button_Sign Up'))

WebUI.waitForAlert(15)

WebUI.closeBrowser()

