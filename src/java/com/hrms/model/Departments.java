package com.hrms.model;
// Generated Dec 16, 2016 10:52:21 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Departments generated by hbm2java
 */
public class Departments  implements java.io.Serializable {


     private int deptId;
     private String deptName;
     private String deptScope;
     private Set employeeProfiles = new HashSet(0);
 

    
    public Departments() {
    }

	
    public Departments(int deptId) {
        this.deptId = deptId;
    }
    public Departments(int deptId, String deptName, String deptScope, Set employeeProfiles) {
       this.deptId = deptId;
       this.deptName = deptName;
       this.deptScope = deptScope;
       this.employeeProfiles = employeeProfiles;
    }
   
    public int getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return this.deptName;
    }
    
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptScope() {
        return this.deptScope;
    }
    
    public void setDeptScope(String deptScope) {
        this.deptScope = deptScope;
    }
    public Set getEmployeeProfiles() {
        return this.employeeProfiles;
    }
    
    public void setEmployeeProfiles(Set employeeProfiles) {
        this.employeeProfiles = employeeProfiles;
    }




}


