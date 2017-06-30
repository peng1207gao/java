package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * CoContractSequenceinfo的POJO类
 *
 * @author  djdeng  [Tue Feb 18 09:19:33 CST 2014]
 * 
 */
public class CoContractSequenceinfo implements Serializable{

    /** 
     * 属性sequenceid
     */
    private String sequenceid;
	
    private String maintenancePer;  //维护人
    
    private String contractType;
    /** 
     * 属性sequencename
     */
    private String sequencename;
	
    /** 
     * 属性sequencetype
     */
    private BigDecimal sequencetype;
    
    private String sequencetypeStr;
	
    /** 
     * 属性marketid
     */
    private String marketid;
	
    /** 
     * 属性updatetime
     */
    private Date updatetime;
	
    /** 
     * 属性updatepersonid
     */
    private String updatepersonid;
	
    /** 
     * 属性sequencecircle
     */
    private BigDecimal sequencecircle;
    
    private String sequencecircleStr;
	
    /** 
     * 属性createdate
     */
    private Date createdate;
    
    private String contractTypeName;
	
    /**
     * CoContractSequenceinfo构造函数
     */
    public CoContractSequenceinfo() {
        super();
    }  
	
    /**
     * CoContractSequenceinfo完整的构造函数
     */  
    public CoContractSequenceinfo(String sequenceid){
        this.sequenceid = sequenceid;
    }
 
    /**
     * 属性 sequenceid 的get方法
     * @return String
     */
    public String getSequenceid(){
        return sequenceid;
    }
	
    /**
     * 属性 sequenceid 的set方法
     * @return
     */
    public void setSequenceid(String sequenceid){
        if(sequenceid != null && sequenceid.trim().length() == 0){
            this.sequenceid = null;
        }else{
            this.sequenceid = sequenceid;
        }
    } 
	
    /**
     * 属性 sequencename 的get方法
     * @return String
     */
    public String getSequencename(){
        return sequencename;
    }
	
    /**
     * 属性 sequencename 的set方法
     * @return
     */
    public void setSequencename(String sequencename){
        this.sequencename = sequencename;
    } 
	
    /**
     * 属性 sequencetype 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSequencetype(){
        return sequencetype;
    }
	
    /**
     * 属性 sequencetype 的set方法
     * @return
     */
    public void setSequencetype(BigDecimal sequencetype){
        this.sequencetype = sequencetype;
    } 
	
    /**
     * 属性 marketid 的get方法
     * @return String
     */
    public String getMarketid(){
        return marketid;
    }
	
    /**
     * 属性 marketid 的set方法
     * @return
     */
    public void setMarketid(String marketid){
        this.marketid = marketid;
    } 
	
    /**
     * 属性 updatetime 的get方法
     * @return Date
     */
    public Date getUpdatetime(){
        return updatetime;
    }
	
    /**
     * 属性 updatetime 的set方法
     * @return
     */
    public void setUpdatetime(Date updatetime){
        this.updatetime = updatetime;
    } 
	
    /**
     * 属性 updatepersonid 的get方法
     * @return String
     */
    public String getUpdatepersonid(){
        return updatepersonid;
    }
	
    /**
     * 属性 updatepersonid 的set方法
     * @return
     */
    public void setUpdatepersonid(String updatepersonid){
        this.updatepersonid = updatepersonid;
    } 
	
    /**
     * 属性 sequencecircle 的get方法
     * @return BigDecimal
     */
    public BigDecimal getSequencecircle(){
        return sequencecircle;
    }
	
    /**
     * 属性 sequencecircle 的set方法
     * @return
     */
    public void setSequencecircle(BigDecimal sequencecircle){
        this.sequencecircle = sequencecircle;
    } 
	
    /**
     * 属性 createdate 的get方法
     * @return Date
     */
    public Date getCreatedate(){
        return createdate;
    }
	
    /**
     * 属性 createdate 的set方法
     * @return
     */
    public void setCreatedate(Date createdate){
        this.createdate = createdate;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof CoContractSequenceinfo))
	        return false; 
			
        if(getSequenceid() == null) 
	        return false;

        CoContractSequenceinfo other = (CoContractSequenceinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getSequenceid(), other.getSequenceid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("sequenceid"+":"+getSequenceid())
            .append("sequencename"+":"+getSequencename())
            .append("sequencetype"+":"+getSequencetype())
            .append("marketid"+":"+getMarketid())
            .append("updatetime"+":"+getUpdatetime())
            .append("updatepersonid"+":"+getUpdatepersonid())
            .append("sequencecircle"+":"+getSequencecircle())
            .append("createdate"+":"+getCreatedate())
            .toString(); 
			
    } 
   

    /**
     * hashcode方法
     * @return int
     * 
     */
    @Override
    public int hashCode(){
		return super.hashCode();
	}

	public String getSequencetypeStr() {
		return sequencetypeStr;
	}

	public void setSequencetypeStr(String sequencetypeStr) {
		this.sequencetypeStr = sequencetypeStr;
	}

	public String getSequencecircleStr() {
		return sequencecircleStr;
	}

	public void setSequencecircleStr(String sequencecircleStr) {
		this.sequencecircleStr = sequencecircleStr;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getMaintenancePer() {
		return maintenancePer;
	}

	public void setMaintenancePer(String maintenancePer) {
		this.maintenancePer = maintenancePer;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

}