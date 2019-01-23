package com.demo.rest.wservices.domain;

import java.math.BigDecimal;

public class Adjustment {

	private String adjustmentCode;
	private BigDecimal  amount  = new BigDecimal("124567890.0987654321"); 
	private String codeDescription;
	private boolean isApprovalNeeded;
	private String approvedBy;
	private String notes;
	private String status;
	
	
	public Adjustment(String adjustmentCode,BigDecimal d,String codeDescription,boolean isApprovalNeeded,String approvedBy,String notes,String status){
		this.adjustmentCode = adjustmentCode;
		this.amount = d;
		this.codeDescription = codeDescription;
		this.isApprovalNeeded = isApprovalNeeded;
		this.approvedBy = approvedBy;
		this.notes = notes;
		this.status = status;
	}
	
	public Adjustment() {}
	
	@Override
	public String toString() {
		return "Adjustment [id=" +  ", version=" + ", adjustmentCode=" + adjustmentCode + ", amount="
				+ amount + ", codeDescription=" + codeDescription + ", isApprovalNeeded=" + isApprovalNeeded
				+ ", approvedBy=" + approvedBy + ", notes=" + notes + ", status=" + status + "]";
	}
	
	public String getAdjustmentCode() {
		return adjustmentCode;
	}
	public void setAdjustmentCode(String adjustmentCode) {
		this.adjustmentCode = adjustmentCode;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getCodeDescription() {
		return codeDescription;
	}
	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}
	public boolean isApprovalNeeded() {
		return isApprovalNeeded;
	}
	public void setApprovalNeeded(boolean isApprovalNeeded) {
		this.isApprovalNeeded = isApprovalNeeded;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
}
