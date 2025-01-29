import com.lakshya.algo.hr.dl.exceptions.*;
import com.lakshya.algo.hr.dl.interfaces.dao.*;
import com.lakshya.algo.hr.dl.interfaces.dto.*;
import com.lakshya.algo.hr.dl.dao.*;
import com.lakshya.algo.hr.dl.dto.*;
class DesignationAddTestCase
{
public static void main(String gg[])
{
try
{
String title=gg[0];
DesignationDTOInterface designationDTO=new DesignationDTO();
designationDTO.setTitle(title);
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDAO.add(designationDTO);
System.out.println("Designation : "+title+" added with code "+designationDTO.getCode());
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}