package com.demo.rest.wservices.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

	@CreatedBy
    @Column(name="created_by", updatable = false, nullable = false)
    protected String createdBy;

    @CreatedDate
    @Column(name="creation_date", updatable = false, nullable = false)
    protected LocalDateTime creationDate;

    @LastModifiedBy
    @Column(name="last_modified_by", nullable = false)
    protected String lastModifiedBy;

    @LastModifiedDate
    @Column(name="last_modified_date", nullable = false)
    protected LocalDateTime lastModifiedDate;

    public Auditable(){
    	
    }
    
	public Auditable(String createdBy, LocalDateTime creationDate, String lastModifiedBy, LocalDateTime lastModifiedDate) {
		super();
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
	@Override
	public String toString() {
		return "Auditable [createdBy=" + createdBy + ", creationDate=" + creationDate + ", lastModifiedBy="
				+ lastModifiedBy + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
}
