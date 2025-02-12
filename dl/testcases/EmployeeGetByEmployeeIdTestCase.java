import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
import com.lakshya.meena.hr.dl.exceptions.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.Date;
class EmployeeGetByEmployeeIdTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDTOInterface employeeDTO;
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
employeeDTO=employeeDAO.getByEmployeeId(gg[0]);
System.out.println(employeeDTO.getEmployeeId());
System.out.println(employeeDTO.getName());
System.out.println(employeeDTO.getDesignationCode());
System.out.println(sdf.format(employeeDTO.getDateOfBirth()));
System.out.println(employeeDTO.getGender());
System.out.println(employeeDTO.getIsIndian());
System.out.println(employeeDTO.getBasicSalary().toPlainString());
System.out.println(employeeDTO.getPANNumber());
System.out.println(employeeDTO.getAadharCardNumber());
}catch(DAOException dao)
{
System.out.println(dao.getMessage());
}
}
}