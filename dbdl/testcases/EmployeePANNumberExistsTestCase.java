import com.lakshya.algo.hr.dl.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.dto.*;
import com.lakshya.algo.hr.dl.exceptions.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.Date;
class EmployeePANNumberExistsTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
boolean EmployeeIdExists=employeeDAO.panNumberExists(gg[0]);
System.out.println("Pan number Exists is "+EmployeeIdExists);
}catch(DAOException dao)
{
System.out.println(dao.getMessage());
}
}
}