import com.google.gson.Gson;
import com.revature.daka.repositories.ModelRepoImpl;
import com.revature.models.Customer;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DriverTest {
    public static void main(String[] args) throws IOException {
        ModelRepoImpl modelRepo = new ModelRepoImpl();
        Gson gson = new Gson();
        // Customer testCust = new Customer("Test", "Customer", 8, true);
        // Customer testCust2 = new Customer("Test", "Customer-Two", 7, false);
        // testCust2.setId(5);
        // Customer testCust3 = new Customer();
        // testCust3.setId(7);
        //
        // modelRepo.addRecord(testCust);
        // Object returned = modelRepo.getRecord("customers", 7);
        // System.out.println("getRecord OUTPUT: " + returned);
        // List<?> returnedList = modelRepo.getAllRecords("customers");
        // System.out.println("getAllRecords OUTPUT: " + returnedList);
        // modelRepo.updateRecord(testCust2);
        // modelRepo.deleteRecord(testCust3);

        List<Customer> custList;
        custList = (List<Customer>) modelRepo.getAllRecords("customers");
        System.out.println(custList);
        System.out.println(gson.toJson(custList));
        // HttpServletResponse response = null;
        // assert false;
        // System.out.println(response.getWriter().append(gson.toJson(custList)));
        // System.out.println(response);
    }
}
