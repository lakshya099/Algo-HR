import com.lakshya.meena.hr.dl.exceptions.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
class DesignationCodeExistsTestCase
{
public static void main(String gg[])
{
try
{
int code=Integer.parseInt(gg[0]);
DesignationDTOInterface designationDTO;
DesignationDAOInterface designationDAO=new DesignationDAO();
System.out.println("Designation code exists : "+designationDAO.codeExists(code));
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}