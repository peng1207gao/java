package com.sgcc.dlsc.entity.po;

//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * PubBuildSubstitute的POJO类
 * 
 * @author admin [Fri Feb 28 16:41:52 CST 2014]
 * 
 */
public class PubBuildSubstitute implements Serializable {

	/**
	 * 属性guid
	 */
	private String guid;

	/**
	 * 属性marketid
	 */
	private String marketid;

	/**
	 * 属性tyear
	 */
	private Integer tyear;

	/**
	 * 属性tmonth
	 */
	private Integer tmonth;

	/**
	 * 属性facname1
	 */
	private String facname1;

	/**
	 * 属性facname2
	 */
	private String facname2;

	/**
	 * 属性electricity
	 */
	private BigDecimal electricity;

	/**
	 * 属性savecoal
	 */
	private BigDecimal savecoal;

	/**
	 * 属性reduceso2
	 */
	private BigDecimal reduceso2;

	/**
	 * 属性state
	 */
	private Integer state = 0;

	/**
	 * 属性subjectguid
	 */
	private String subjectguid;

	/**
	 * 属性fillinman
	 */
	private String fillinman;

	/**
	 * 属性fillintime
	 */
	private Date fillintime;

	/**
	 * 属性bak1
	 */
	private BigDecimal bak1;

	/**
	 * 属性bak2
	 */
	private BigDecimal bak2;

	/**
	 * 属性bak3
	 */
	private BigDecimal bak3;

	/**
	 * 属性bak4
	 */
	private BigDecimal bak4;

	/**
	 * 属性bak5
	 */
	private String bak5;

	/**
	 * 属性bak6
	 */
	private String bak6;
	/**
	 * 属性price1
	 */
	private BigDecimal price1;
	/**
	 * 属性electricity1
	 */
	private BigDecimal electricity1;
	/**
	 * 属性price2
	 */
	private BigDecimal price2;
	/**
	 * 属性businessType
	 */
	private String businessType;
	/**
	 * 属性businessType
	 */
	private String facid1;
	/**
	 * 属性businessType
	 */
	private String facid2;
	
	/**
	 * PubBuildSubstitute构造函数
	 */
	public PubBuildSubstitute() {
		super();
	}

	/**
	 * PubBuildSubstitute完整的构造函数
	 */
	public PubBuildSubstitute(String guid, String marketid, Integer tyear,
			Integer tmonth, Integer state, String fillinman, Date fillintime) {
		this.guid = guid;
		this.marketid = marketid;
		this.tyear = tyear;
		this.tmonth = tmonth;
		this.state = state;
		this.fillinman = fillinman;
		this.fillintime = fillintime;
	}

	/**
	 * 属性 guid 的get方法
	 * 
	 * @return String
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * 属性 guid 的set方法
	 * 
	 * @return
	 */
	public void setGuid(String guid) {
		if (guid != null && guid.trim().length() == 0) {
			this.guid = null;
		} else {
			this.guid = guid;
		}
	}

	/**
	 * 属性 marketid 的get方法
	 * 
	 * @return String
	 */
	public String getMarketid() {
		return marketid;
	}

	/**
	 * 属性 marketid 的set方法
	 * 
	 * @return
	 */
	public void setMarketid(String marketid) {
		this.marketid = marketid;
	}

	/**
	 * 属性 tyear 的get方法
	 * 
	 * @return Integer
	 */
	public Integer getTyear() {
		return tyear;
	}

	/**
	 * 属性 tyear 的set方法
	 * 
	 * @return
	 */
	public void setTyear(Integer tyear) {
		this.tyear = tyear;
	}

	/**
	 * 属性 tmonth 的get方法
	 * 
	 * @return Integer
	 */
	public Integer getTmonth() {
		return tmonth;
	}

	/**
	 * 属性 tmonth 的set方法
	 * 
	 * @return
	 */
	public void setTmonth(Integer tmonth) {
		this.tmonth = tmonth;
	}

	/**
	 * 属性 facname1 的get方法
	 * 
	 * @return String
	 */
	public String getFacname1() {
		return facname1;
	}

	/**
	 * 属性 facname1 的set方法
	 * 
	 * @return
	 */
	public void setFacname1(String facname1) {
		this.facname1 = facname1;
	}

	/**
	 * 属性 facname2 的get方法
	 * 
	 * @return String
	 */
	public String getFacname2() {
		return facname2;
	}

	/**
	 * 属性 facname2 的set方法
	 * 
	 * @return
	 */
	public void setFacname2(String facname2) {
		this.facname2 = facname2;
	}

	/**
	 * 属性 electricity 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getElectricity() {
		return electricity;
	}

	/**
	 * 属性 electricity 的set方法
	 * 
	 * @return
	 */
	public void setElectricity(BigDecimal electricity) {
		this.electricity = electricity;
	}

	/**
	 * 属性 savecoal 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getSavecoal() {
		return savecoal;
	}

	/**
	 * 属性 savecoal 的set方法
	 * 
	 * @return
	 */
	public void setSavecoal(BigDecimal savecoal) {
		this.savecoal = savecoal;
	}

	/**
	 * 属性 reduceso2 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getReduceso2() {
		return reduceso2;
	}

	/**
	 * 属性 reduceso2 的set方法
	 * 
	 * @return
	 */
	public void setReduceso2(BigDecimal reduceso2) {
		this.reduceso2 = reduceso2;
	}

	/**
	 * 属性 state 的get方法
	 * 
	 * @return Integer
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * 属性 state 的set方法
	 * 
	 * @return
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 属性 subjectguid 的get方法
	 * 
	 * @return String
	 */
	public String getSubjectguid() {
		return subjectguid;
	}

	/**
	 * 属性 subjectguid 的set方法
	 * 
	 * @return
	 */
	public void setSubjectguid(String subjectguid) {
		this.subjectguid = subjectguid;
	}

	/**
	 * 属性 fillinman 的get方法
	 * 
	 * @return String
	 */
	public String getFillinman() {
		return fillinman;
	}

	/**
	 * 属性 fillinman 的set方法
	 * 
	 * @return
	 */
	public void setFillinman(String fillinman) {
		this.fillinman = fillinman;
	}

	/**
	 * 属性 fillintime 的get方法
	 * 
	 * @return Date
	 */
	public Date getFillintime() {
		return fillintime;
	}

	/**
	 * 属性 fillintime 的set方法
	 * 
	 * @return
	 */
	public void setFillintime(Date fillintime) {
		this.fillintime = fillintime;
	}

	/**
	 * 属性 bak1 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBak1() {
		return bak1;
	}

	/**
	 * 属性 bak1 的set方法
	 * 
	 * @return
	 */
	public void setBak1(BigDecimal bak1) {
		this.bak1 = bak1;
	}

	/**
	 * 属性 bak2 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBak2() {
		return bak2;
	}

	/**
	 * 属性 bak2 的set方法
	 * 
	 * @return
	 */
	public void setBak2(BigDecimal bak2) {
		this.bak2 = bak2;
	}

	/**
	 * 属性 bak3 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBak3() {
		return bak3;
	}

	/**
	 * 属性 bak3 的set方法
	 * 
	 * @return
	 */
	public void setBak3(BigDecimal bak3) {
		this.bak3 = bak3;
	}

	/**
	 * 属性 bak4 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getBak4() {
		return bak4;
	}

	/**
	 * 属性 bak4 的set方法
	 * 
	 * @return
	 */
	public void setBak4(BigDecimal bak4) {
		this.bak4 = bak4;
	}

	/**
	 * 属性 bak5 的get方法
	 * 
	 * @return String
	 */
	public String getBak5() {
		return bak5;
	}

	/**
	 * 属性 bak5 的set方法
	 * 
	 * @return
	 */
	public void setBak5(String bak5) {
		this.bak5 = bak5;
	}

	/**
	 * 属性 bak6 的get方法
	 * 
	 * @return String
	 */
	public String getBak6() {
		return bak6;
	}

	/**
	 * 属性 bak6 的set方法
	 * 
	 * @return
	 */
	public void setBak6(String bak6) {
		this.bak6 = bak6;
	}

	/**
	 * 属性 price1 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getPrice1() {
		return price1;
	}

	/**
	 * 属性 price1 的set方法
	 * 
	 * @return
	 */
	public void setPrice1(BigDecimal price1) {
		this.price1 = price1;
	}

	/**
	 * 属性 electricity1 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getElectricity1() {
		return electricity1;
	}

	/**
	 * 属性 electricity1 的set方法
	 * 
	 * @return
	 */
	public void setElectricity1(BigDecimal electricity1) {
		this.electricity1 = electricity1;
	}

	/**
	 * 属性 price2 的get方法
	 * 
	 * @return BigDecimal
	 */
	public BigDecimal getPrice2() {
		return price2;
	}

	/**
	 * 属性 price2 的set方法
	 * 
	 * @return
	 */
	public void setPrice2(BigDecimal price2) {
		this.price2 = price2;
	}

	/**
	 * 属性 businessType 的get方法
	 * 
	 * @return String
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * 属性 businessType 的set方法
	 * 
	 * @return
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	
	
	/**
	 * 属性 facid1 的get方法
	 * 
	 * @return
	 */
	public String getFacid1() {
		return facid1;
	}
	/**
	 * 属性 facid1 的set方法
	 * 
	 * @return
	 */
	public void setFacid1(String facid1) {
		this.facid1 = facid1;
	}
	/**
	 * 属性 facid2 的get方法
	 * 
	 * @return
	 */
	public String getFacid2() {
		return facid2;
	}
	/**
	 * 属性 facid2 的set方法
	 * 
	 * @return
	 */
	public void setFacid2(String facid2) {
		this.facid2 = facid2;
	}

	/**
	 * Hibernate通过该方法判断对象是否相等
	 * 
	 * @return boolean
	 */
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null || !(o instanceof PubBuildSubstitute))
			return false;

		if (getGuid() == null)
			return false;

		PubBuildSubstitute other = (PubBuildSubstitute) o;
		return new EqualsBuilder().append(this.getGuid(), other.getGuid())
				.isEquals();
	}

	/**
	 * toString方法
	 * 
	 * @return String
	 */
	public String toString() {

		return new StringBuffer().append("guid" + ":" + getGuid())
				.append("marketid" + ":" + getMarketid())
				.append("tyear" + ":" + getTyear())
				.append("tmonth" + ":" + getTmonth())
				.append("facname1" + ":" + getFacname1())
				.append("facname2" + ":" + getFacname2())
				.append("electricity" + ":" + getElectricity())
				.append("savecoal" + ":" + getSavecoal())
				.append("reduceso2" + ":" + getReduceso2())
				.append("state" + ":" + getState())
				.append("subjectguid" + ":" + getSubjectguid())
				.append("fillinman" + ":" + getFillinman())
				.append("fillintime" + ":" + getFillintime())
				.append("bak1" + ":" + getBak1())
				.append("bak2" + ":" + getBak2())
				.append("bak3" + ":" + getBak3())
				.append("bak4" + ":" + getBak4())
				.append("bak5" + ":" + getBak5())
				.append("bak6" + ":" + getBak6())
				.append("price1" + ":" + getPrice1())
				.append("electricity1" + ":" + getElectricity1())
				.append("price2" + ":" + getPrice2())
				.append("businessType" + ":" + getBusinessType()).toString();

	}

	/**
	 * hashcode方法
	 * 
	 * @return int
	 * 
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}