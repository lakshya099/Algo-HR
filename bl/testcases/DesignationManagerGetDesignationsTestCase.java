import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import com.lakshya.algo.hr.bl.interfaces.managers.*;
import com.lakshya.algo.hr.bl.pojo.*;
import com.lakshya.algo.hr.bl.managers.*;
import com.lakshya.algo.hr.bl.exceptions.*;
import java.util.*;
class DesignationManagerGetDesignationsTestCase
{
public static void main(String gg[])
{
try
{
Set<DesignationInterface> designations=DesignationManager.getDesignationManager().getDesignations();
for(DesignationInterface designation : designations)
{
System.out.println(designation.getCode()+" "+designation.getTitle());
}
}catch(BLException blException)
{
if(blException.hasGenericException())
{
System.out.println(blException.getGenericException());
}
if(blException.hasExceptions())
{
List<String> properties=blException.getProperties();
for(String property : properties)
{
System.out.println(blException.getException(property));
} 
}
}
}
}