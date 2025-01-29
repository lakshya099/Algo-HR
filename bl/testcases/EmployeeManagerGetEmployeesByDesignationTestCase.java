import com.lakshya.algo.hr.bl.interfaces.managers.*;
import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import com.lakshya.algo.hr.bl.managers.*;
import com.lakshya.algo.hr.bl.pojo.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import com.lakshya.algo.enums.*;
import com.lakshya.algo.hr.bl.exceptions.*;
import com.lakshya.algo.hr.dl.exceptions.*;
import java.text.*;
import java.util.*;
import java.math.*;
class EmployeeManagerGetEmployeesByDesignationTestCase
{
public static void main(String gg[])
{
try
{
EmployeeManagerInterface employeeManager=EmployeeManager.getEmployeeManager();
Set<EmployeeInterface> employees=employeeManager.getEmployeesByDesignation(6);
for(EmployeeInterface employee : employees)
{
System.out.println(employee.getEmployeeId());
System.out.println(employee.getName());
System.out.printf("Designation code %d,Designation title %s \n",employee.getDesignation().getCode(),employee.getDesignation().getTitle());
SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
System.out.println(sdf.format(employee.getDateOfBirth()));
System.out.println(employee.getGender());
System.out.println(employee.getIsIndian());
System.out.println(employee.getBasicSalary().toPlainString());
System.out.println(employee.getPANNumber());
System.out.println(employee.getAadharCardNumber());
}
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