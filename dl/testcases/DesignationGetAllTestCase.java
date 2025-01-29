import com.lakshya.meena.hr.dl.exceptions.*;
import java.util.*;
import com.lakshya.meena.hr.dl.interfaces.dao.*;
import com.lakshya.meena.hr.dl.interfaces.dto.*;
import com.lakshya.meena.hr.dl.dao.*;
import com.lakshya.meena.hr.dl.dto.*;
class DesignationGetAllTestCase
{
public static void main(String gg[])
{
try
{
Set<DesignationDTOInterface> designationDTOSet;
DesignationDAOInterface designationDAO=new DesignationDAO();
designationDTOSet=designationDAO.getAll();
designationDTOSet.forEach((designationDTO)->{
System.out.printf("Designation code is %d , and title is %s \n",designationDTO.getCode(),designationDTO.getTitle());
});
System.out.println("Technique 2");
for(DesignationDTOInterface designationDTOs : designationDTOSet)
{
System.out.printf("Designation code is %d , and title is %s \n",designationDTOs.getCode(),designationDTOs.getTitle());
}
}catch(DAOException daoException)
{
System.out.println(daoException.getMessage());
}
}
}