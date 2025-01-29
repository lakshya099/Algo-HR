import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
import com.lakshya.meena.hr.dl.exceptions.*;
import com.lakshya.meena.enums.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.*;
class EmployeeGetAllTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
Set<EmployeeDTOInterface> employees;
employees=employeeDAO.getAll();
System.out.println("Data Fatching starts from here");
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
employees.forEach((e)->{
System.out.println(e.getEmployeeId());
System.out.println(e.getName());
System.out.println(e.getDesignationCode());
System.out.println(sdf.format(e.getDateOfBirth()));
System.out.println(e.getGender());
System.out.println(e.getIsIndian());
System.out.println(e.getBasicSalary().toPlainString());
System.out.println(e.getPANNumber());
System.out.println(e.getAadharCardNumber());
});
}catch(DAOException dao)
{
System.out.println(dao.getMessage());
}
}
}