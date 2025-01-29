import com.lakshya.algo.hr.bl.managers.*;
import com.lakshya.algo.hr.bl.pojo.*;
import com.lakshya.algo.hr.bl.interfaces.managers.*;
import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import java.util.*;
import com.lakshya.algo.hr.bl.exceptions.*;
class DesignationManagerAddTestCase
{
public static void main(String gg[])
{
try
{
DesignationInterface designation=new Designation();
designation.setTitle(gg[0]);
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
designationManager.addDesignation(designation);
System.out.println("Designation added with code : "+designation.getCode());
}catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
//or List<String> properties = blException.getProperties();
for(String property : blException.getProperties())
{
System.out.println(blException.getException(property));
}
}
}
}