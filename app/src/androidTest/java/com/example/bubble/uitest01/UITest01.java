package com.example.bubble.uitest01;

/*import org.junit.Before;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Until;
*/
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.core.internal.deps.guava.collect.UnmodifiableIterator;
import android.support.test.uiautomator.UiAutomatorInstrumentationTestRunner;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;


//@RunWith(AndroidJUnit4.class)
//@SdkSuppress(minSdkVersion = 18)
public class UITest01 extends UiAutomatorTestCase
{
   public void setUp() throws Exception {


       super.setUp();

       UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
       device.pressHome();
       // UiObject allAppsButton = new UiObject(new UiSelector().packageName("com.gotokeep.keep.intl"));
       UiObject allAppsButton = new UiObject(new UiSelector().description("Keep"));
       allAppsButton.clickAndWaitForNewWindow();


   }


    public void testSum() throws UiObjectNotFoundException {
        UiObject cal = new UiObject(new UiSelector().text("锻炼"));
        cal.click();

        UiObject res=new UiObject(new UiSelector().className("android.widget.TextView"));
        assertEquals("","徒手塑形初级",res.getText());
    }





    }
