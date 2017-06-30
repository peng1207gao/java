package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaComflowactdef的POJO类
 *
 * @author  zhangpei  [Wed Jan 22 11:14:39 CST 2014]
 * 
 */
public class BaComflowactdef implements Serializable{

    /** 
     * 属性actid
     */
    private String actid;
	
    /** 
     * 属性actname
     */
    private String actname;
	
    /** 
     * 属性flowid
     */
    private String flowid;
	
    /** 
     * 属性orderno
     */
    private BigDecimal orderno;
	
    /** 
     * 属性nodeurl
     */
    private String nodeurl;
	
    /** 
     * 属性dealrole
     */
    private String dealrole;
	
    /** 
     * 属性backstr1
     */
    private String backstr1;
	
    /** 
     * 属性backstr2
     */
    private String backstr2;
	
    /** 
     * 属性backstr3
     */
    private String backstr3;
	
    /** 
     * 属性backstr4
     */
    private String backstr4;
	
    /** 
     * 属性backstr5
     */
    private String backstr5;
	
    /**
     * BaComflowactdef构造函数
     */
    public BaComflowactdef() {
        super();
    }  
	
    /**
     * BaComflowactdef完整的构造函数
     */  
    public BaComflowactdef(String actid,String actname,String flowid,BigDecimal orderno){
        this.actid = actid;
        this.actname = actname;
        this.flowid = flowid;
        this.orderno = orderno;
    }
 
    /**
     * 属性 actid 的get方法
     * @return String
     */
    public String getActid(){
        return actid;
    }
	
    /**
     * 属性 actid 的set方法
     * @return
     */
    public void setActid(String actid){
        if(actid != null && actid.trim().length() == 0){
            this.actid = null;
        }else{
            this.actid = actid;
        }
    } 
	
    /**
     * 属性 actname 的get方法
     * @return String
     */
    public String getActname(){
        return actname;
    }
	
    /**
     * 属性 actname 的set方法
     * @return
     */
    public void setActname(String actname){
        this.actname = actname;
    } 
	
    /**
     * 属性 flowid 的get方法
     * @return String
     */
    public String getFlowid(){
        return flowid;
    }
	
    /**
     * 属性 flowid 的set方法
     * @return
     */
    public void setFlowid(String flowid){
        this.flowid = flowid;
    } 
	
    /**
     * 属性 orderno 的get方法
     * @return BigDecimal
     */
    public BigDecimal getOrderno(){
        return orderno;
    }
	
    /**
     * 属性 orderno 的set方法
     * @return
     */
    public void setOrderno(BigDecimal orderno){
        this.orderno = orderno;
    } 
	
    /**
     * 属性 nodeurl 的get方法
     * @return String
     */
    public String getNodeurl(){
        return nodeurl;
    }
	
    /**
     * 属性 nodeurl 的set方法
     * @return
     */
    public void setNodeurl(String nodeurl){
        this.nodeurl = nodeurl;
    } 
	
    /**
     * 属性 dealrole 的get方法
     * @return String
     */
    public String getDealrole(){
        return dealrole;
    }
	
    /**
     * 属性 dealrole 的set方法
     * @return
     */
    public void setDealrole(String dealrole){
        this.dealrole = dealrole;
    } 
	
    /**
     * 属性 backstr1 的get方法
     * @return String
     */
    public String getBackstr1(){
        return backstr1;
    }
	
    /**
     * 属性 backstr1 的set方法
     * @return
     */
    public void setBackstr1(String backstr1){
        this.backstr1 = backstr1;
    } 
	
    /**
     * 属性 backstr2 的get方法
     * @return String
     */
    public String getBackstr2(){
        return backstr2;
    }
	
    /**
     * 属性 backstr2 的set方法
     * @return
     */
    public void setBackstr2(String backstr2){
        this.backstr2 = backstr2;
    } 
	
    /**
     * 属性 backstr3 的get方法
     * @return String
     */
    public String getBackstr3(){
        return backstr3;
    }
	
    /**
     * 属性 backstr3 的set方法
     * @return
     */
    public void setBackstr3(String backstr3){
        this.backstr3 = backstr3;
    } 
	
    /**
     * 属性 backstr4 的get方法
     * @return String
     */
    public String getBackstr4(){
        return backstr4;
    }
	
    /**
     * 属性 backstr4 的set方法
     * @return
     */
    public void setBackstr4(String backstr4){
        this.backstr4 = backstr4;
    } 
	
    /**
     * 属性 backstr5 的get方法
     * @return String
     */
    public String getBackstr5(){
        return backstr5;
    }
	
    /**
     * 属性 backstr5 的set方法
     * @return
     */
    public void setBackstr5(String backstr5){
        this.backstr5 = backstr5;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaComflowactdef))
	        return false; 
			
        if(getActid() == null) 
	        return false;

        BaComflowactdef other = (BaComflowactdef) o;	        
	    return new EqualsBuilder()
            .append(this.getActid(), other.getActid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("actid"+":"+getActid())
            .append("actname"+":"+getActname())
            .append("flowid"+":"+getFlowid())
            .append("orderno"+":"+getOrderno())
            .append("nodeurl"+":"+getNodeurl())
            .append("dealrole"+":"+getDealrole())
            .append("backstr1"+":"+getBackstr1())
            .append("backstr2"+":"+getBackstr2())
            .append("backstr3"+":"+getBackstr3())
            .append("backstr4"+":"+getBackstr4())
            .append("backstr5"+":"+getBackstr5())
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