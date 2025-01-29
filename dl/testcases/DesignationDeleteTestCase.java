import com.lakshya.meena.hr.dl.exceptions.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
class DesignationDeleteTestCase
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDAO.delete(code);
System.out.println("Designation deleted");
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}