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

WebUI.setText(findTestObject('Object Repository/Back From Grade Structure/Page_React App/input_Username_usn'), 'vinhtk')

WebUI.setEncryptedText(findTestObject('Object Repository/Back From Grade Structure/Page_React App/input_Password_pwd'), 
    'PqsVwYhx40I=')

WebUI.click(findTestObject('Object Repository/Back From Grade Structure/Page_React App/button_Log In'))

WebUI.click(findTestObject('Object Repository/Back From Grade Structure/Page_React App/a_Intro2P'))

WebUI.click(findTestObject('Object Repository/Back From Grade Structure/Page_React App/a_Grade Structure'))

WebUI.click(findTestObject('Object Repository/Back From Grade Structure/Page_React App/a_Back to class'))

WebUI.verifyElementPresent(findTestObject('Back From Grade Structure/Page_React App/a_Grade Structure'), 5)

WebUI.closeBrowser()

