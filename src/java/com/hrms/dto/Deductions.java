package com.hrms.dto;
// Generated Nov 18, 2016 10:25:48 AM by Hibernate Tools 4.3.1

import com.hrms.model.DeductionRules;
import com.hrms.model.EmployeeProfile;




/**
 * DeductionMaster generated by hbm2java
 */
public class Deductions  implements java.io.Serializable {


    // private Integer id;
     private DeductionRules deductionRules;
     private EmployeeProfile employeeProfile;
     private int deductionId;
     private String deductionName;
     private String deductionCode;
     private int pfNum;
     private int pf;
     private int ppp;
     private int salaryAdvance;
     private int loanAmount;
     private int power;
     private int meals;
     private int tiffin;
     private int tea;
     private int store;
     private int medicines;
     private int cable;
     private int gas;
     private int adv2;
     private int eggs; 
     private int totalDeductions;
     private int deductionRuleId;
     private int empId;
     private int uniform;
     private String recordCreationDate;

    public String getRecordCreationDate() {
        return recordCreationDate;
    }

    public void setRecordCreationDate(String recordCreationDate) {
        this.recordCreationDate = recordCreationDate;
    }
     
    public Deductions() {
    }

    public int getUniform() {
        return uniform;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setUniform(int uniform) {
        this.uniform = uniform;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

	
    public Deductions(int deductionId) {
        this.deductionId = deductionId;
    }
    public Deductions(DeductionRules deductionRules, EmployeeProfile employeeProfile, int deductionId, String deductionName, String deductionCode) {
       this.deductionRules = deductionRules;
       this.employeeProfile = employeeProfile;
       this.deductionId = deductionId;
       this.deductionName = deductionName;
       this.deductionCode = deductionCode;
    }

    public int getDeductionRuleId() {
        return deductionRuleId;
    }

    public void setDeductionRuleId(int deductionRuleId) {
        this.deductionRuleId = deductionRuleId;
    }

    public int getPfNum() {
        return pfNum;
    }

    public void setPfNum(int pfNum) {
        this.pfNum = pfNum;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public int getPpp() {
        return ppp;
    }

    public void setPpp(int ppp) {
        this.ppp = ppp;
    }

    public int getSalaryAdvance() {
        return salaryAdvance;
    }

    public void setSalaryAdvance(int salaryAdvance) {
        this.salaryAdvance = salaryAdvance;
    }

   
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMeals() {
        return meals;
    }

    public void setMeals(int meals) {
        this.meals = meals;
    }

    public int getTiffin() {
        return tiffin;
    }

    public void setTiffin(int tiffin) {
        this.tiffin = tiffin;
    }

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }

    public int getMedicines() {
        return medicines;
    }

    public void setMedicines(int medicines) {
        this.medicines = medicines;
    }

    public int getCable() {
        return cable;
    }

    public void setCable(int cable) {
        this.cable = cable;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getAdv2() {
        return adv2;
    }

    public void setAdv2(int adv2) {
        this.adv2 = adv2;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getTotalDeductions() {
        return totalDeductions;
    }

    public void setTotalDeductions(int totalDeductions) {
        this.totalDeductions = totalDeductions;
    }
   
//    public Integer getId() {
//        return this.id;
//    }
//    
//    public void setId(Integer id) {
//        this.id = id;
//    }
    public DeductionRules getDeductionRules() {
        return this.deductionRules;
    }
    
    public void setDeductionRules(DeductionRules deductionRules) {
        this.deductionRules = deductionRules;
    }
    public EmployeeProfile getEmployeeProfile() {
        return this.employeeProfile;
    }
    
    public void setEmployeeProfile(EmployeeProfile employeeProfile) {
        this.employeeProfile = employeeProfile;
    }
    public int getDeductionId() {
        return this.deductionId;
    }
    
    public void setDeductionId(int deductionId) {
        this.deductionId = deductionId;
    }
    public String getDeductionName() {
        return this.deductionName;
    }
    
    public void setDeductionName(String deductionName) {
        this.deductionName = deductionName;
    }
    public String getDeductionCode() {
        return this.deductionCode;
    }
    
    public void setDeductionCode(String deductionCode) {
        this.deductionCode = deductionCode;
    }




}


