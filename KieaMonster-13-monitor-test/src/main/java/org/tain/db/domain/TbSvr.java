package org.tain.db.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_svr"
	, indexes = {
		@Index(name = "svr_idx0", unique = false, columnList = "svr_code")	
	}
)
@SequenceGenerator(name = "svr_seq"
	, sequenceName = "svr_seq"
	, initialValue = 1
	, allocationSize = 1)
@Data
@NoArgsConstructor
@JsonIgnoreProperties(value = {})
public class TbSvr {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "svr_seq")
	@Column(name = "id")
	private Long id;

	@Column(name = "grp_code")
	private String grpCode;
	
	@Column(name = "svr_code")
	private String svrCode;
	
	@Column(name = "svr_name")
	private String svrName;
	
	@Column(name = "svr_desc")
	private String svrDesc;
	
	@Column(name = "svr_comment")
	private String svrComment;
	
	@Builder
	public TbSvr(
			String svrCode,
			String svrName,
			String svrDesc,
			String svrComment
			) {
		this.svrCode = svrCode;
		this.svrName = svrName;
		this.svrDesc = svrDesc;
		this.svrComment = svrComment;
	}
			
	
}
