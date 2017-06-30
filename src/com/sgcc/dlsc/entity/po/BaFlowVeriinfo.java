package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaFlowVeriinfo的POJO类
 *
 * @author  Administrator  [Wed Oct 23 15:16:41 CST 2013]
 * 
 */
public class BaFlowVeriinfo implements Serializable{

    /** 
     * 属性workitemid
     */
    private BigDecimal workitemid;
	
    /** 
     * 属性outcome
     */
    private BigDecimal outcome;
	
    /** 
     * 属性opiniom
     */
    private String opiniom;
	
    /** 
     * 属性operetedate
     */
    private Date operetedate;
	
    /** 
     * 属性usercode
     */
    private String usercode;
	
    /** 
     * 属性extends1
     */
    private String extends1;
	
    /** 
     * 属性extends2
     */
    private String extends2;
	
    /** 
     * 属性extends3
     */
    private String extends3;
	
    /**
     * BaFlowVeriinfo构造函数
     */
    public BaFlowVeriinfo() {
        super();
    }  
	
    /**
     * BaFlowVeriinfo完整的构造函数
     */  
    public BaFlowVeriinfo(BigDecimal workitemid){
        this.workitemid = workitemid;
    }
 
    /**
     * 属性 workitemid 的get方法
     * @return BigDecimal
     */
    public BigDecimal getWorkitemid(){
        return workitemid;
    }
	
    /**
     * 属性 workitemid 的set方法
     * @return
     */
    public void setWorkitemid(BigDecimal workitemid){
        this.workitemid = workitemid;
    } 
	
    /**
     * 属性 outcome 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOutcome(){
        return outcome;
    }
	
    /**
     * 属性 outcome 的set方法
     * @return
     */
    public void setOutcome(BigDecimal outcome){
        this.outcome = outcome;
    } 
	
    /**
     * 属性 opiniom 的get方法
     * @return String
     */
    public String getOpiniom(){
        return opiniom;
    }
	
    /**
     * 属性 opiniom 的set方法
     * @return
     */
    public void setOpiniom(String opiniom){
        this.opiniom = opiniom;
    } 
	
    /**
     * 属性 operetedate 的get方法
     * @return Date
     */
    public Date getOperetedate(){
        return operetedate;
    }
	
    /**
     * 属性 operetedate 的set方法
     * @return
     */
    public void setOperetedate(Date operetedate){
        this.operetedate = operetedate;
    } 
	
    /**
     * 属性 usercode 的get方法
     * @return String
     */
    public String getUsercode(){
        return usercode;
    }
	
    /**
     * 属性 usercode 的set方法
     * @return
     */
    public void setUsercode(String usercode){
        this.usercode = usercode;
    } 
	
    /**
     * 属性 extends1 的get方法
     * @return String
     */
    public String getExtends1(){
        return extends1;
    }
	
    /**
     * 属性 extends1 的set方法
     * @return
     */
    public void setExtends1(String extends1){
        this.extends1 = extends1;
    } 
	
    /**
     * 属性 extends2 的get方法
     * @return String
     */
    public String getExtends2(){
        return extends2;
    }
	
    /**
     * 属性 extends2 的set方法
     * @return
     */
    public void setExtends2(String extends2){
        this.extends2 = extends2;
    } 
	
    /**
     * 属性 extends3 的get方法
     * @return String
     */
    public String getExtends3(){
        return extends3;
    }
	
    /**
     * 属性 extends3 的set方法
     * @return
     */
    public void setExtends3(String extends3){
        this.extends3 = extends3;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaFlowVeriinfo))
	        return false; 
			
        if(getWorkitemid() == null) 
	        return false;

        BaFlowVeriinfo other = (BaFlowVeriinfo) o;	        
	    return new EqualsBuilder()
            .append(this.getWorkitemid(), other.getWorkitemid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("workitemid"+":"+getWorkitemid())
            .append("outcome"+":"+getOutcome())
            .append("opiniom"+":"+getOpiniom())
            .append("operetedate"+":"+getOperetedate())
            .append("usercode"+":"+getUsercode())
            .append("extends1"+":"+getExtends1())
            .append("extends2"+":"+getExtends2())
            .append("extends3"+":"+getExtends3())
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

}