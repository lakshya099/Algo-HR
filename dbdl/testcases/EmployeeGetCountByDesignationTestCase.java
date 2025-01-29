import com.lakshya.algo.hr.dl.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.dto.*;
import com.lakshya.algo.hr.dl.exceptions.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import java.math.BigDecimal;
import java.text.*;
import java.util.*;
class EmployeeGetCountByDesignationTestCase
{
public static void main(String gg[])
{
try
{
EmployeeDAOInterface employeeDAO=new EmployeeDAO();
System.out.println("Total no of Employees are : "+employeeDAO.getCountByDesignation(Integer.parseInt(gg[0])));
}catch(DAOException dao)
{
System.out.println(dao.getMessage());
}
}
}