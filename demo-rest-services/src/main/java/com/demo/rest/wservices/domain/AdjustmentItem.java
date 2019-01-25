package com.demo.rest.wservices.domain;

import java.math.BigDecimal;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.demo.rest.wservices.domain.Adjustment;

public class AdjustmentItem extends Auditable {

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="adjustment_id")
	@JsonIgnore
	private Adjustment adjustment;
	
	
	@Id
	@SequenceGenerator(name="ADJUSTMENT_ITEM_SEQ",sequenceName="ADJUSTMENT_ITEM_SEQ",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADJUSTMENT_ITEM_SEQ")
	private long id;
	
	private String adjustmentCode;
	private BigDecimal amount = new BigDecimal(0.0);
	private String codeDescription;
	private boolean isApprovalNeeded;
	private String approvedBy;
	private String notes;
	private String status;
	
	public AdjustmentItem(){
		
	}

	public AdjustmentItem(String adjustmentCode, BigDecimal amount, String codeDescription, boolean isApprovalNeeded) {
		this.adjustmentCode = adjustmentCode;
		this.amount = amount;
		this.codeDescription = codeDescription;
		this.isApprovalNeeded = isApprovalNeeded;
	}
	
	
	@Override
	public String toString() {
		return "AdjustmentItem [id=" + id + ", adjustmentCode=" + adjustmentCode + ", amount=" + amount
				+ ", codeDescription=" + codeDescription + ", isApprovalNeeded=" + isApprovalNeeded + ", approvedBy="
				+ approvedBy + ", notes=" + notes + ", status=" + status + "]";
	}
	
	
	public Adjustment getAdjustment() {
		return adjustment;
	}
	public void setAdjustment(Adjustment adjustment) {
		this.adjustment = adjustment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
