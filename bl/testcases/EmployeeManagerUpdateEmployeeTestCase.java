import com.lakshya.algo.hr.bl.interfaces.managers.*;
import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import com.lakshya.algo.hr.bl.managers.*;
import com.lakshya.algo.hr.bl.pojo.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import com.lakshya.algo.enums.*;
import com.lakshya.algo.hr.bl.exceptions.*;
import com.lakshya.algo.hr.dl.exceptions.*;
import java.util.*;
import java.math.*;
class EmployeeManagerUpdateEmployeeTestCase
{
public static void main(String gg[])
{
try
{
EmployeeInterface employee=new Employee();
employee.setEmployeeId("a10000005");
employee.setName("Harshat Maheta");
DesignationInterface designation=new Designation();
designation.setCode(5);
employee.setDesignation(designation);
employee.setDateOfBirth(new Date());
employee.setGender(GENDER.FEMALE);
employee.setIsIndian(true);
employee.setBasicSalary(new BigDecimal(3000000));
employee.setPANNumber("pin1239");
employee.setAadharCardNumber("Ain1239  ");
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
employeeManager.updateEmployee(employee);
System.out.println("Employee add with code : "+employee.getEmployeeId());
}catch(BLException blException)
{
if(blException.hasGenericException()) System.out.println(blException.getGenericException());
List<String> properties=blException.getProperties();
for(String property : properties)
{
System.out.println(blException.getException(property));
} 
}
}
}