package com.tyss.azuredatastore.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
@Data
public class Customer implements Serializable{
	@Id
	@GeneratedValue
	@Column
	private long identityId;
	@Column
	@JsonProperty("HighestParentCustName")
	private String highestParentCustName;
	@Column
	@JsonProperty("SoldToName")
	private String soldToName;
	@Column
	@JsonProperty("IndustrySegmentation")
	private String industrySegmentation;
	@Column
	@JsonProperty("MarketSegmentDesc")
	private String marketSegmentDesc;
	@Column
	@JsonProperty("AccountClassification")
	private String accountClassification;
	@Column
	@JsonProperty("CustomerSegmentDesc")
	private String customerSegmentDesc;
	@Column
	@JsonProperty("SoldToDelInd")
	private String soldToDelInd;
	@ElementCollection
	@JsonProperty("SalesSoldToOrderBlocked")
	private List<Boolean> salesSoldToOrderBlocked;
	@ElementCollection
	@JsonProperty("SalesSoldToDelInd")
	private List<String> salesSoldToDelInd;
	@ElementCollection
	@JsonProperty("SoldToSalesRepName")
	private List<String> soldToSalesRepName;
}
