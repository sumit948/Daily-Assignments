package com.example.hibernate.Week3.hibernatedemo.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value =  {"createdAt", "updatedAt"},
allowGetters = true
)
public abstract class AuditModel implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdAt", nullable=false,updatable=false)
	@CreatedDate
	private Date createdAt;
	 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;
    
    @Version
    private Integer version;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, updatedAt, version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuditModel other = (AuditModel) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt)
				&& Objects.equals(version, other.version);
	}

	@Override
	public String toString() {
		return "AuditModel [createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", version=" + version + "]";
	}
    
    
		
}
