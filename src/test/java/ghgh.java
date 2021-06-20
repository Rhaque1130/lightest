import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ghgh {

    /*public void static main (Strings[]args);

    System.out.println("fuck me");
    System.out.println("fuck me, fuck you");
    */

    Select towingRoad = new Select(driver.findElement(By.name("form_data[vehicle_info][towing_or_roadside_1]")));
            towingRoad.selectByValue("Reject");

    Select rentalReimburse = new Select(driver.findElement(By.name("form_data[vehicle_info][rental_1]")));
            rentalReimburse.selectByValue("15");

    Select glassCoverage = new Select(driver.findElement(By.name("form_data[vehicle_info][full_glass_1]")));
            glassCoverage.selectByValue("Yes");

    WebElement step4 = driver.findElement(By.name("next"));
            step4.click();
}
