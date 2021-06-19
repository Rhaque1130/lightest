import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase {
    WebDriver driver;

    //1
    @AfterTest
    public void tearDown(){
     //   driver.close();
      //  driver.quit();
    }

//2

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chrome/chromedriver 2");
        driver = new ChromeDriver();

    }

    //3
        @Test
        public void verifyUserCanMoveToStep2Page() {
            String url = "https://insurancewebsitedemo.com/personal-insurance/car-insurance";
            driver.get(url);
            String expectedTitle = "Auto, Automobile, Car, Vehicle Insurance in Las Vegas Nevada - Demo Insurance Agency,";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(actualTitle, expectedTitle);

            WebElement notif = driver.findElement(By.id("notice-close"));
            notif.click();

            WebElement quoteRequestLink = driver.findElement(By.linkText("Auto Insurance Quote Request"));
            quoteRequestLink.click();

            //validate we are in form page
            WebElement headerText = driver.findElement(By.id("title_div"));
            String actualHeaderText = headerText.getText();
            String expectedHeaderText = "Secure Auto Insurance Quote Request Form";
            Assert.assertEquals(actualHeaderText, expectedHeaderText);

            //fillout form
            WebElement firstName = driver.findElement(By.name("fname"));
            firstName.sendKeys("Tester");

            //
            WebElement lastName = driver.findElement(By.name("lname"));
            lastName.sendKeys("one");

            //
            WebElement emailadd = driver.findElement(By.name("email"));
            emailadd.sendKeys("rafiul6@yahoo.com");

            //
            WebElement phonenum = driver.findElement(By.name("phone"));
            phonenum.sendKeys("3456798765");

            //
            WebElement zip = driver.findElement(By.name("zip"));
            zip.sendKeys("11373");

            //
            WebElement step2 = driver.findElement(By.name("start"));
            step2.click();

            WebElement newform = driver.findElement(By.id("title_div"));
            String actualPage = newform.getText();
            String expectedPage = "Secure Auto Insurance Quote Request Form";
            Assert.assertEquals(actualPage, expectedPage);

            //
            WebElement address = driver.findElement(By.id("address"));
            address.sendKeys("5313 grand ave");

            //
            WebElement city = driver.findElement(By.id("city"));
            city.sendKeys("");
//dob
            Select month = new Select(driver.findElement(By.cssSelector("#form_div > form > fieldset > div:nth-child(8) > div.sfs-input-wrapper > select:nth-child(1)")));
            month.selectByValue("01");

            Select date = new Select(driver.findElement(By.name("form_data[applicant_info][_crypt_date_DOB][day]")));
            date.selectByValue("03");

            Select year = new Select(driver.findElement(By.name("form_data[applicant_info][_crypt_date_DOB][year]")));
            year.selectByValue("1994");

            Select occupation = new Select(driver.findElement(By.name("form_data[applicant_info][occupation]")));
            occupation.selectByValue("ACT");

            Select education = new Select(driver.findElement(By.name("form_data[applicant_info][education]")));
            education.selectByValue("HighSchool");

            WebElement ssn1 = driver.findElement(By.id("ssn"));
            ssn1.sendKeys("123456789");

            Select creditReport = new Select(driver.findElement(By.name("form_data[applicant_info][report_consent]")));
            creditReport.selectByValue("Yes");

            Select residenceType = new Select(driver.findElement(By.name("form_data[applicant_info][residence_type]")));
            residenceType.selectByValue("MH");

            Select residenceOwnership = new Select(driver.findElement(By.name("form_data[applicant_info][home_ownership]")));
            residenceOwnership.selectByValue("Own");

            Select yearsAtAddress = new Select(driver.findElement(By.id("yar")));
            yearsAtAddress.selectByValue("6");

            Select gender = new Select(driver.findElement(By.id("gender")));
            gender.selectByValue("M");

            Select maritalStatus = new Select(driver.findElement(By.name("form_data[applicant_info][marital_status]")));
            maritalStatus.selectByValue("S");

            WebElement step3 = driver.findElement(By.name("next"));
            step3.click();

            Select numOfVehicles = new Select(driver.findElement(By.id("Number_of_Vehicles")));
            numOfVehicles.selectByValue("1");

            WebElement vehicleYear = driver.findElement(By.name("form_data[vehicle_info][year_1]"));
            vehicleYear.sendKeys("1994");

            WebElement vehicleMake = driver.findElement(By.name("form_data[vehicle_info][make_1]"));
            vehicleMake.sendKeys("Lambo");

            WebElement vehicleModel = driver.findElement(By.name("form_data[vehicle_info][model_1]"));
            vehicleModel.sendKeys("gallardo");

            Select bodyType = new Select(driver.findElement(By.name("form_data[vehicle_info][body_type_1]")));
            bodyType.selectByValue("SEDAN");

            WebElement vin = driver.findElement(By.name("form_data[vehicle_info][VIN_1]"));
            vin.sendKeys("g123456789");

            Select ownership = new Select(driver.findElement(By.name("form_data[vehicle_info][ownership_1]")));
            ownership.selectByValue("Owned");

            WebElement nameOnTitle = driver.findElement(By.name("form_data[vehicle_info][titled_to_1]"));
            nameOnTitle.sendKeys("Mother");

            WebElement holderAddress = driver.findElement(By.name("form_data[vehicle_info][lienholder_address_1]"));
            holderAddress.sendKeys("N/A");

            WebElement currentOdo = driver.findElement(By.name("form_data[vehicle_info][current_odometer_1]"));
            currentOdo.sendKeys("15000");

            WebElement weeklyDrive = driver.findElement(By.name("form_data[vehicle_info][days_driven_per_week_1]"));
            weeklyDrive.sendKeys("5");

            WebElement distanceOneWay = driver.findElement(By.name("form_data[vehicle_info][distance_one_way_1]"));
            distanceOneWay.sendKeys("25");

            WebElement yearlyMile = driver.findElement(By.name("form_data[vehicle_info][yearly_mileage_1]"));
            yearlyMile.sendKeys("500");

            Select primaryUse = new Select(driver.findElement(By.name("form_data[vehicle_info][use_1]")));
            primaryUse.selectByValue("PL");

            Select nightPark = new Select(driver.findElement(By.name("form_data[vehicle_info][garaging_1]")));
            nightPark.selectByValue("G");

            Select antiTheft = new Select(driver.findElement(By.name("form_data[vehicle_info][anti_theft_features_1][]")));
            antiTheft.selectByValue("Other");

            Select passiveRestraint = new Select(driver.findElement(By.name("form_data[vehicle_info][passive_restraints_1][]")));
            passiveRestraint.selectByValue("None");

            Select antiBrake = new Select(driver.findElement(By.name("form_data[vehicle_info][Anti-Lock_brakes_1]")));
            antiBrake.selectByValue("Yes");

            Select daytimeLight = new Select(driver.findElement(By.name("form_data[vehicle_info][daytime_running_lights_1]")));
            daytimeLight.selectByValue("Yes");

            Select priorDamage = new Select(driver.findElement(By.name("form_data[vehicle_info][prior_damage_1]")));
            priorDamage.selectByValue("No");

            Select delivery = new Select(driver.findElement(By.name("form_data[vehicle_info][used_for_delivery_1]")));
            delivery.selectByValue("No");

            Select collision = new Select(driver.findElement(By.name("form_data[vehicle_info][collision_deductible_1]")));
            collision.selectByValue("50");

            Select comprehensive = new Select(driver.findElement(By.name("form_data[vehicle_info][comprehensive_deductible_1]")));
            comprehensive.selectByValue("Declined");

            Select towingRoad = new Select(driver.findElement(By.name("form_data[vehicle_info][towing_or_roadside_1]")));
            towingRoad.selectByValue("Reject");

            Select rentalReimburse = new Select(driver.findElement(By.name("form_data[vehicle_info][rental_1]")));
            rentalReimburse.selectByValue("15");

            Select glassCoverage = new Select(driver.findElement(By.name("form_data[vehicle_info][full_glass_1]")));
            glassCoverage.selectByValue("Yes");

            WebElement step4 = driver.findElement(By.name("next"));
            step4.click();




























        }

        }

        //4
        /*
        @Test
        public void verifyGoogleSearch1() {
            String url = "https://mvnrepository.com";
            driver.get(url);
            String expectedTitle = "";
            String actualTitle = driver.getTitle();;
            Assert.assertEquals(actualTitle, expectedTitle);
       */






