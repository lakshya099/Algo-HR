package com.lakshya.algo.hr.bl.interfaces.managers;
import com.lakshya.algo.hr.bl.exceptions.*;
import com.lakshya.algo.hr.bl.interfaces.pojo.*;
import com.lakshya.algo.hr.bl.pojo.*;
import java.util.*;
public interface DesignationManagerInterface
{
public void addDesignation(DesignationInterface designation) throws BLException;
public void updateDesignation(DesignationInterface designation) throws BLException;
public void removeDesignation(int code) throws BLException;
public DesignationInterface getDesignationByCode(int code) throws BLException;
public DesignationInterface getDesignationByTitle(String title) throws BLException;
public boolean isDesignationCodeExists(int code);
public boolean isDesignationTitleExists(String title);
public int getDesignationCount();
public Set<DesignationInterface> getDesignations();
}