<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >

<suite name="Mobile Test Suite" parallel="none">

                <test name="ChromeTestCases">
                    <parameter name="testBox" value="local"/>
                    <parameter name="version" value="59.0"/>
                    <parameter name="browser" value="mobile"/>
                    <parameter name="platform" value="Windows 10"/>
                    <classes>
                        <class name ="com.romanceabroad.ui.RegistrationTests2"/>
                    </classes>

                </test>
        </suite>