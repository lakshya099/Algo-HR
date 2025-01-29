import com.lakshya.algo.hr.pl.ui.*;
import com.lakshya.algo.nframework.server.*;
import com.lakshya.algo.nframework.server.annotations.*;
@Path("/main")
class Mains
{
@Path("/starter")
public void starter()
{
DesignationUI designationUI;
designationUI=new DesignationUI();
designationUI.setVisible(true);
EmployeeUI employeeUI=new EmployeeUI();
employeeUI.setVisible(true);
}
public static void main(String args[])
{
NFrameworkServer server=new NFrameworkServer();
server.registerClass(Mains.class);
server.start();
}
}