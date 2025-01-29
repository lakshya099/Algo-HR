import com.lakshya.algo.hr.bl.managers.*;
import com.lakshya.algo.hr.bl.pojo.*;
import com.lakshya.algo.hr.bl.interfaces.managers.*;
import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import java.util.*;
import com.lakshya.algo.hr.bl.exceptions.*;
class DesignationManagerRemoveTestCase
{
public static void main(String gg[])
{
try
{
DesignationManagerInterface designationManager=DesignationManager.getDesignationManager();
designationManager.removeDesignation(Integer.parseInt(gg[0]));
System.out.println("Designation deleted ");
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