package com.sgcc.dlsc.entity.po;
//导入 java 类
import java.io.Serializable;
import java.math.BigDecimal;
import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * BaWaitdo的POJO类
 *
 * @author  Administrator  [Fri Feb 14 09:09:50 CST 2014]
 * 
 */
public class BaWaitdo implements Serializable{

    /** 
     * 属性waitdoid
     */
    private String waitdoid;
	
    /** 
     * 属性sequenceid
     */
    private String sequenceid;
	
    /** 
     * 属性userid
     */
    private String userid;
	
    /** 
     * 属性url
     */
    private String url;
	
    /** 
     * 属性type
     */
    private String type;
	
    /** 
     * 属性startdate
     */
    private String startdate;
	
    /** 
     * 属性activename
     */
    private String activename;
	
    /** 
     * 属性currentstate
     */
    private BigDecimal currentstate;
	
    /** 
     * 属性processinstname
     */
    private String processinstname;
	
    /** 
     * 属性processdefid
     */
    private String processdefid;
	
    /** 
     * 属性processchname
     */
    private String processchname;
	
    /** 
     * 属性activityinstid
     */
    private String activityinstid;
	
    /** 
     * 属性workitemid
     */
    private String workitemid;
	
    /**
     * BaWaitdo构造函数
     */
    public BaWaitdo() {
        super();
    }  
	
    /**
     * BaWaitdo完整的构造函数
     */  
    public BaWaitdo(String waitdoid){
        this.waitdoid = waitdoid;
    }
 
    /**
     * 属性 waitdoid 的get方法
     * @return String
     */
    public String getWaitdoid(){
        return waitdoid;
    }
	
    /**
     * 属性 waitdoid 的set方法
     * @return
     */
    public void setWaitdoid(String waitdoid){
        if(waitdoid != null && waitdoid.trim().length() == 0){
            this.waitdoid = null;
        }else{
            this.waitdoid = waitdoid;
        }
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
        this.sequenceid = sequenceid;
    } 
	
    /**
     * 属性 userid 的get方法
     * @return String
     */
    public String getUserid(){
        return userid;
    }
	
    /**
     * 属性 userid 的set方法
     * @return
     */
    public void setUserid(String userid){
        this.userid = userid;
    } 
	
    /**
     * 属性 url 的get方法
     * @return String
     */
    public String getUrl(){
        return url;
    }
	
    /**
     * 属性 url 的set方法
     * @return
     */
    public void setUrl(String url){
        this.url = url;
    } 
	
    /**
     * 属性 type 的get方法
     * @return String
     */
    public String getType(){
        return type;
    }
	
    /**
     * 属性 type 的set方法
     * @return
     */
    public void setType(String type){
        this.type = type;
    } 
	
    /**
     * 属性 startdate 的get方法
     * @return String
     */
    public String getStartdate(){
        return startdate;
    }
	
    /**
     * 属性 startdate 的set方法
     * @return
     */
    public void setStartdate(String startdate){
        this.startdate = startdate;
    } 
	
    /**
     * 属性 activename 的get方法
     * @return String
     */
    public String getActivename(){
        return activename;
    }
	
    /**
     * 属性 activename 的set方法
     * @return
     */
    public void setActivename(String activename){
        this.activename = activename;
    } 
	
    /**
     * 属性 currentstate 的get方法
     * @return BigDecimal
     */
    public BigDecimal getCurrentstate(){
        return currentstate;
    }
	
    /**
     * 属性 currentstate 的set方法
     * @return
     */
    public void setCurrentstate(BigDecimal currentstate){
        this.currentstate = currentstate;
    } 
	
    /**
     * 属性 processinstname 的get方法
     * @return String
     */
    public String getProcessinstname(){
        return processinstname;
    }
	
    /**
     * 属性 processinstname 的set方法
     * @return
     */
    public void setProcessinstname(String processinstname){
        this.processinstname = processinstname;
    } 
	
    /**
     * 属性 processdefid 的get方法
     * @return String
     */
    public String getProcessdefid(){
        return processdefid;
    }
	
    /**
     * 属性 processdefid 的set方法
     * @return
     */
    public void setProcessdefid(String processdefid){
        this.processdefid = processdefid;
    } 
	
    /**
     * 属性 processchname 的get方法
     * @return String
     */
    public String getProcesschname(){
        return processchname;
    }
	
    /**
     * 属性 processchname 的set方法
     * @return
     */
    public void setProcesschname(String processchname){
        this.processchname = processchname;
    } 
	
    /**
     * 属性 activityinstid 的get方法
     * @return String
     */
    public String getActivityinstid(){
        return activityinstid;
    }
	
    /**
     * 属性 activityinstid 的set方法
     * @return
     */
    public void setActivityinstid(String activityinstid){
        this.activityinstid = activityinstid;
    } 
	
    /**
     * 属性 workitemid 的get方法
     * @return String
     */
    public String getWorkitemid(){
        return workitemid;
    }
	
    /**
     * 属性 workitemid 的set方法
     * @return
     */
    public void setWorkitemid(String workitemid){
        this.workitemid = workitemid;
    } 
	
    /**
     * Hibernate通过该方法判断对象是否相等
     * @return boolean
     */  
    public boolean equals(Object o) {
        if (this == o)
			return true;
		
        if (o == null || !(o instanceof BaWaitdo))
	        return false; 
			
        if(getWaitdoid() == null) 
	        return false;

        BaWaitdo other = (BaWaitdo) o;	        
	    return new EqualsBuilder()
            .append(this.getWaitdoid(), other.getWaitdoid())
			.isEquals();
    } 
     
    /**
     * toString方法
     * @return String
     */
	public String toString(){

		  return new StringBuffer()
            .append("waitdoid"+":"+getWaitdoid())
            .append("sequenceid"+":"+getSequenceid())
            .append("userid"+":"+getUserid())
            .append("url"+":"+getUrl())
            .append("type"+":"+getType())
            .append("startdate"+":"+getStartdate())
            .append("activename"+":"+getActivename())
            .append("currentstate"+":"+getCurrentstate())
            .append("processinstname"+":"+getProcessinstname())
            .append("processdefid"+":"+getProcessdefid())
            .append("processchname"+":"+getProcesschname())
            .append("activityinstid"+":"+getActivityinstid())
            .append("workitemid"+":"+getWorkitemid())
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