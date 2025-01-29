import com.lakshya.algo.hr.dl.exceptions.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import com.lakshya.algo.hr.dl.dao.*;
import com.lakshya.algo.hr.dl.dto.*;
class DesignationGetByTitleTestCase
{
public static void main(String gg[])
{
try
{
String title=gg[0];
DesignationDTOInterface designationDTO;
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDTO=designationDAO.getByTitle(title);
System.out.println("Designation code is "+designationDTO.getCode()+",title is "+designationDTO.getTitle());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}