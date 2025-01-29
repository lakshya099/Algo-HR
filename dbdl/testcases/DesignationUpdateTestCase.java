import com.lakshya.algo.hr.dl.exceptions.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import com.lakshya.algo.hr.dl.dao.*;
import com.lakshya.algo.hr.dl.dto.*;
class DesignationDeleteTestCase
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDAO.delete(code);
System.out.println("Designation delete");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}