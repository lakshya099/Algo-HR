import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
import com.lakshya.meena.hr.dl.exceptions.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.Date;
class EmployeeGetCountTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
int EmployeeCount=employeeDAO.getCount();
System.out.println("Record count is : "+EmployeeCount);
}catch(DAOException dao)
{
System.out.println(dao.getMessage());
}
}
}